/*****  P A R A M S  *****/
param M >=0, integer;           /* total number of players */
set P := 1..M;                  /* players index */
param n >=0, integer;           /* number of players to pick */
param s >=0, integer;           /* number of on bench (not counted towards optimized points) */
param c >=0, integer;           /* number of max players from one club*/
param budget >=0, integer;      /* budget */

set positions;
set clubs;
param minOnPositions{positions} >=0, integer;      /* minimum number of players to pick on given position */
param maxOnPositions{positions} >=0, integer;      /* maximum number of players to pick on given position */

param NAME{P}, symbolic;       /* player names */
param COST{P} >=0, integer;    /* player cost */
param POINTS{P} >=0, integer;  /* player points */
param POS{P} symbolic;         /* player position */
param CLUB{P} symbolic;        /* player club */


/****  D E C I S I O N   V A R I A B L E S  *****/
var CHOICE{P} binary;
var SUB{P} binary;


/****  O B J E C T I V E   F U N C T I O N  *****/
maximize 
	value: sum{p in P} CHOICE[p]*POINTS[p];


/****  C O N S T R A I N T S  *****/
s.t.
	 rosterSize: sum{p in P} (CHOICE[p]) = n-s;
	 benchSize: sum{p in P} (SUB[p]) = s;
	 posMax{pos in positions}: sum{p in P: POS[p]=pos} (CHOICE[p]+SUB[p]) <= maxOnPositions[pos];
	 posMin{pos in positions}: sum{p in P: POS[p]=pos} (CHOICE[p]) >= minOnPositions[pos];
	 clubMax{cl in clubs}: sum{p in P: CLUB[p]=cl} (CHOICE[p]+SUB[p]) <= c;
	 
	 totalValue: sum{p in P} ((CHOICE[p]+SUB[p])*COST[p]) <= budget;


solve; 


#printf "\n\n";
#display CHOICE;
#display SUB;
#display NAMES;

printf "\n\n";

for{ p in P } {
   for {{0}: CHOICE[p] || SUB[p]} {
      printf "[%0.3d] %13s - %2.1d / %4.1f$", p, NAME[p], POINTS[p], COST[p]/10.0;
	  for {{0}: SUB[p]} {
		printf " (sub)";
	}
	printf "\n";
   }
}

printf "\n";
printf "cost: %.1f", (sum{p in P} ((CHOICE[p]+SUB[p])*COST[p]))/10.0 ;
printf "\n\n\n";


end;
