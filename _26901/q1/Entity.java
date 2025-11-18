import java.time.LocalDate;

class Entity {
    private final int id;
    private final LocalDate createdDate;
    private final LocalDate updatedDate;

    protected Entity(int id, LocalDate createdDate, LocalDate updatedDate) {
        require(id > 0, "id must be > 0");
        require(createdDate != null, "createdDate must not be null");
        require(updatedDate != null, "updatedDate must not be null");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    protected static void require(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }
}