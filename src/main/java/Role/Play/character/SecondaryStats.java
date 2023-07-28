package Role.Play.character;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class SecondaryStats {

    @Column
    private int bab;
    @Column
    private int fortitudeSave;
    @Column
    private int reflexSave;
    @Column
    private int willSave;

    public SecondaryStats(int bab, int fortitudeSave, int reflexSave, int willSave) {
        this.bab = bab;
        this.fortitudeSave = fortitudeSave;
        this.reflexSave = reflexSave;
        this.willSave = willSave;
    }

    public SecondaryStats() {
    }

    public int getBab() {
        return bab;
    }

    public void setBab(int bab) {
        this.bab = bab;
    }

    public int getFortitudeSave() {
        return fortitudeSave;
    }

    public void setFortitudeSave(int fortitudeSave) {
        this.fortitudeSave = fortitudeSave;
    }

    public int getReflexSave() {
        return reflexSave;
    }

    public void setReflexSave(int reflexSave) {
        this.reflexSave = reflexSave;
    }

    public int getWillSave() {
        return willSave;
    }

    public void setWillSave(int willSave) {
        this.willSave = willSave;
    }
}
