package org.namor.pojo;


import com.sun.org.glassfish.external.statistics.Stats;

public class MyPojo
{
    private Teams[] teams;

    private String current-event;

    private Game-settings game-settings;

    private Next_event_fixtures[] next_event_fixtures;

    private String next-event;

    private Events[] events;

    private Stats stats;

    private String last-entry-event;

    private Phases[] phases;

    private String total-players;

    private Element_types[] element_types;

    private Stats_options[] stats_options;

    private Elements[] elements;

    public Teams[] getTeams ()
    {
        return teams;
    }

    public void setTeams (Teams[] teams)
    {
        this.teams = teams;
    }

    public String getCurrent-event ()
{
    return current-event;
}

    public void setCurrent-event (String current-event)
{
    this.current-event = current-event;
}

    public Game-settings getGame-settings ()
{
    return game-settings;
}

    public void setGame-settings (Game-settings game-settings)
{
    this.game-settings = game-settings;
}

    public Next_event_fixtures[] getNext_event_fixtures ()
    {
        return next_event_fixtures;
    }

    public void setNext_event_fixtures (Next_event_fixtures[] next_event_fixtures)
    {
        this.next_event_fixtures = next_event_fixtures;
    }

    public String getNext-event ()
{
    return next-event;
}

    public void setNext-event (String next-event)
{
    this.next-event = next-event;
}

    public Events[] getEvents ()
    {
        return events;
    }

    public void setEvents (Events[] events)
    {
        this.events = events;
    }

    public Stats getStats ()
    {
        return stats;
    }

    public void setStats (Stats stats)
    {
        this.stats = stats;
    }

    public String getLast-entry-event ()
{
    return last-entry-event;
}

    public void setLast-entry-event (String last-entry-event)
{
    this.last-entry-event = last-entry-event;
}

    public Phases[] getPhases ()
    {
        return phases;
    }

    public void setPhases (Phases[] phases)
    {
        this.phases = phases;
    }

    public String getTotal-players ()
{
    return total-players;
}

    public void setTotal-players (String total-players)
{
    this.total-players = total-players;
}

    public Element_types[] getElement_types ()
    {
        return element_types;
    }

    public void setElement_types (Element_types[] element_types)
    {
        this.element_types = element_types;
    }

    public Stats_options[] getStats_options ()
    {
        return stats_options;
    }

    public void setStats_options (Stats_options[] stats_options)
    {
        this.stats_options = stats_options;
    }

    public Elements[] getElements ()
    {
        return elements;
    }

    public void setElements (Elements[] elements)
    {
        this.elements = elements;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [teams = "+teams+", current-event = "+current-event+", game-settings = "+game-settings+", next_event_fixtures = "+next_event_fixtures+", next-event = "+next-event+", events = "+events+", stats = "+stats+", last-entry-event = "+last-entry-event+", phases = "+phases+", total-players = "+total-players+", element_types = "+element_types+", stats_options = "+stats_options+", elements = "+elements+"]";
    }
}
