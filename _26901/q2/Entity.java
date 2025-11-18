package _26901.q2;

import java.time.LocalDate;

public abstract class Entity {
    private final long id;
    private final LocalDate createdDate;
    private LocalDate updatedDate;

    protected Entity(long id) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        this.id = id;
        this.createdDate = LocalDate.now();
        this.updatedDate = this.createdDate;
    }

    public long getId() { return id; }
    public LocalDate getCreatedDate() { return createdDate; }
    public LocalDate getUpdatedDate() { return updatedDate; }

    protected void touch() { this.updatedDate = LocalDate.now(); }
}
