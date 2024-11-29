package com.jonah.vttp5_ssf_day07carpark.model;

public class Carpark {
    private String carpark_number;
    private String total_lots;
    private String lots_available;

    


    public Carpark() {
    }

    public Carpark(String carpark_number, String total_lots, String lots_available) {
        this.carpark_number = carpark_number;
        this.total_lots = total_lots;
        this.lots_available = lots_available;
    }
    public String getCarpark_number() {
        return carpark_number;
    }
    public void setCarpark_number(String carpark_number) {
        this.carpark_number = carpark_number;
    }
    public String getTotal_lots() {
        return total_lots;
    }
    public void setTotal_lots(String total_lots) {
        this.total_lots = total_lots;
    }
    public String getLots_available() {
        return lots_available;
    }
    public void setLots_available(String lots_available) {
        this.lots_available = lots_available;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((carpark_number == null) ? 0 : carpark_number.hashCode());
        result = prime * result + ((total_lots == null) ? 0 : total_lots.hashCode());
        result = prime * result + ((lots_available == null) ? 0 : lots_available.hashCode());
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
        Carpark other = (Carpark) obj;
        if (carpark_number == null) {
            if (other.carpark_number != null)
                return false;
        } else if (!carpark_number.equals(other.carpark_number))
            return false;
        if (total_lots == null) {
            if (other.total_lots != null)
                return false;
        } else if (!total_lots.equals(other.total_lots))
            return false;
        if (lots_available == null) {
            if (other.lots_available != null)
                return false;
        } else if (!lots_available.equals(other.lots_available))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return carpark_number + "," + total_lots + ","
                + lots_available;
    }

    
    

    
}
