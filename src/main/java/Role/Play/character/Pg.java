package Role.Play.character;

import jakarta.persistence.*;

@Entity
@Table
public class Pg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String classe;
    @Column
    private String race;
    @Column
    private int level;
    @Column
    private String city;
    @Column
    private String photo;

    private Stats stats;
    private SecondaryStats secondaryStats;


    public Pg(Long id, String name, String classe, String race, int level, String city, String photo, Stats stats, SecondaryStats secondaryStats) {
        this.id = id;
        this.name = name;
        this.classe = classe;
        this.race = race;
        this.level = level;
        this.city = city;
        this.photo = photo;
        this.stats = stats;
        this.secondaryStats = secondaryStats;
    }

    public Pg() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public SecondaryStats getSecondaryStats() {
        return secondaryStats;
    }

    public void setSecondaryStats(SecondaryStats secondaryStats) {
        this.secondaryStats = secondaryStats;
    }
}
