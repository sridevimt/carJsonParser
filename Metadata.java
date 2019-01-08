import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Metadata implements Serializable{

    private static final long serialVersionUID = 9075305231907207440L;

    @SerializedName(value= "Color")
    private String color;

    @SerializedName(value= "Notes")
    private String notes;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        notes = notes;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "Color='" + color + '\'' +
                ", Notes='" + notes + '\'' +
                '}';
    }
}
