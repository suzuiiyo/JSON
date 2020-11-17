public class DataModel{
    public String subject;
    public String summary;
    public String cover;
    public String pic;
    public String format;
    public String changed;

    @Override
    public String toString() {
        return "DataModel{" +
                "subject='" + subject + '\'' +
                ", summary='" + summary + '\'' +
                ", cover='" + cover + '\'' +
                ", pic='" + pic + '\'' +
                ", format='" + format + '\'' +
                ", changed='" + changed + '\'' +
                '}';
    }
}