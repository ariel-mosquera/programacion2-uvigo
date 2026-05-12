package ejercicio3;

public class Carriage {
    private String name;
    private Carriage next;
    private Carriage previous;

    public Carriage(String name, Carriage next, Carriage previous) {
        this.name = name;
        this.setNext(next);
        this.setPrevious(previous);
    }

    public String getName() {
        return this.name;
    }

    public void setNext(Carriage newNext) {
        if (this.next != null)
            this.next.setPrevious(null);

        if (newNext != null) {
            if (newNext.getPrevious() != null)
                newNext.getPrevious().setNext(null);

            newNext.setPrevious(this);
        }

        this.next = newNext;
    }

    public Carriage getNext() {
        return this.next;
    }

    private void setPrevious(Carriage newPrevious) {
        this.previous = newPrevious;
    }

    public Carriage getPrevious() {
        return this.previous;
    }

    public int howManyFollows() {
        Carriage current = this.getPrevious();
        int counter = 0;

        while (current != null) {
            current = current.getPrevious();
            counter++;
        }

        return counter;
    }

}
