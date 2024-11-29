package com.jonah.vttp5_ssf_day07carpark.model;

public class Joke {
    private Integer id;
    private String type;
    private String setup;
    private String punchline;

    


    public Joke() {
    }

    
    public Joke(Integer id, String type, String setup, String punchline) {
        this.id = id;
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }
    


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSetup() {
        return setup;
    }
    public void setSetup(String setup) {
        this.setup = setup;
    }
    public String getPunchline() {
        return punchline;
    }
    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((setup == null) ? 0 : setup.hashCode());
        result = prime * result + ((punchline == null) ? 0 : punchline.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Joke other = (Joke) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (setup == null) {
            if (other.setup != null)
                return false;
        } else if (!setup.equals(other.setup))
            return false;
        if (punchline == null) {
            if (other.punchline != null)
                return false;
        } else if (!punchline.equals(other.punchline))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return id + "," + type + "," + setup + "," + punchline;
    }

    
}
