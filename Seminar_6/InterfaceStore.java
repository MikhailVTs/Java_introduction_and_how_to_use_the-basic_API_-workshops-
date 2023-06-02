import java.util.List;

public interface InterfaceStore<E> {

    List<E> getLaptopsStore();

    void setLaptopStore(List<E> goods);
    void setLaptopStore(E goods);
}