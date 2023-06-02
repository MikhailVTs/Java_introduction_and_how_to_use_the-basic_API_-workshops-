import java.util.ArrayList;
import java.util.List;

public class Store<LaptopsList> implements InterfaceStore<LaptopsList> {

    private List<LaptopsList> goods = new ArrayList<>();

    @Override
    public List<LaptopsList> getLaptopsStore() {
        return this.goods;
    }


    public void setLaptopStore(List<LaptopsList> goods) {

        for (LaptopsList item : goods){
            this.setLaptopStore(item);
        }
    }

    @Override
    public void setLaptopStore(LaptopsList goods) {
        this.goods.add(goods);
    }
}