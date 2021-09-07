package DailyWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DailyWeatherDescr {

    //Attributes
    @JsonProperty("id")
    private long id;
    @JsonProperty("main")
    private String main;
    @JsonProperty("description")
    private String description;
    @JsonProperty("icon")
    private String icon;

    //constructor for use in serialization
    public DailyWeatherDescr() {
    } // end of constructor

    //constructor
    public DailyWeatherDescr(long id, String main, String description, String icon) {
        super();
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    } //end of constructor

    //setters and getters
    //get id
    public long getId() {
        return id;
    }

    //set id
    public void setId(long id) {
        this.id = id;
    }

    //get main
    public String getMain() {
        return main;
    }

    //set main
    public void setMain(String main) {
        this.main = main;
    }

    //get description
    public String getDescription() {
        return description;
    }

    //set description
    public void setDescription(String description) {
        this.description = description;
    }

    //get icon
    public String getIcon() {
        return icon;
    }

    //set icon
    public void setIcon(String icon) {
        this.icon = icon;
    }
    //end setters and getters

    //return a string containing only the needed daily weather information
    @Override
    public String toString() {
        return String.format("%s, %8s", getMain(), getDescription());
    }
    // end method toString
}
