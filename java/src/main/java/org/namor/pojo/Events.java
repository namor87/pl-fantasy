package org.namor.pojo;

public class Events
{
    private String highest_scoring_entry;

    private String is_previous;

    private String finished;

    private String deadline_time;

    private String id;

    private String is_next;

    private String deadline_time_epoch;

    private String average_entry_score;

    private String name;

    private String is_current;

    private String deadline_time_game_offset;

    private String deadline_time_formatted;

    private String data_checked;

    private String highest_score;

    public String getHighest_scoring_entry ()
    {
        return highest_scoring_entry;
    }

    public void setHighest_scoring_entry (String highest_scoring_entry)
    {
        this.highest_scoring_entry = highest_scoring_entry;
    }

    public String getIs_previous ()
    {
        return is_previous;
    }

    public void setIs_previous (String is_previous)
    {
        this.is_previous = is_previous;
    }

    public String getFinished ()
    {
        return finished;
    }

    public void setFinished (String finished)
    {
        this.finished = finished;
    }

    public String getDeadline_time ()
    {
        return deadline_time;
    }

    public void setDeadline_time (String deadline_time)
    {
        this.deadline_time = deadline_time;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getIs_next ()
    {
        return is_next;
    }

    public void setIs_next (String is_next)
    {
        this.is_next = is_next;
    }

    public String getDeadline_time_epoch ()
    {
        return deadline_time_epoch;
    }

    public void setDeadline_time_epoch (String deadline_time_epoch)
    {
        this.deadline_time_epoch = deadline_time_epoch;
    }

    public String getAverage_entry_score ()
    {
        return average_entry_score;
    }

    public void setAverage_entry_score (String average_entry_score)
    {
        this.average_entry_score = average_entry_score;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getIs_current ()
    {
        return is_current;
    }

    public void setIs_current (String is_current)
    {
        this.is_current = is_current;
    }

    public String getDeadline_time_game_offset ()
    {
        return deadline_time_game_offset;
    }

    public void setDeadline_time_game_offset (String deadline_time_game_offset)
    {
        this.deadline_time_game_offset = deadline_time_game_offset;
    }

    public String getDeadline_time_formatted ()
    {
        return deadline_time_formatted;
    }

    public void setDeadline_time_formatted (String deadline_time_formatted)
    {
        this.deadline_time_formatted = deadline_time_formatted;
    }

    public String getData_checked ()
    {
        return data_checked;
    }

    public void setData_checked (String data_checked)
    {
        this.data_checked = data_checked;
    }

    public String getHighest_score ()
    {
        return highest_score;
    }

    public void setHighest_score (String highest_score)
    {
        this.highest_score = highest_score;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [highest_scoring_entry = "+highest_scoring_entry+", is_previous = "+is_previous+", finished = "+finished+", deadline_time = "+deadline_time+", id = "+id+", is_next = "+is_next+", deadline_time_epoch = "+deadline_time_epoch+", average_entry_score = "+average_entry_score+", name = "+name+", is_current = "+is_current+", deadline_time_game_offset = "+deadline_time_game_offset+", deadline_time_formatted = "+deadline_time_formatted+", data_checked = "+data_checked+", highest_score = "+highest_score+"]";
    }
}