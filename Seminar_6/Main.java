import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var stor = new Store<Laptop>();
        var laptops = new ArrayList<Laptop>();
        addGoods(laptops);
        stor.setLaptopStore(laptops);


        Map<String, String> sortStore = new HashMap<>();
        sortStore.put(String.valueOf(OperationSystem.Windows), String.valueOf(RAM.Corsair_CMSA4GX3M1A1066C7));
        sortStore.put(String.valueOf(OperationSystem.Ubuntu), String.valueOf(Color.Green));

        var filter = Filtering.getFilteredLaptopsBy(sortStore, stor.getLaptopsStore());
        System.out.println(filter);

        System.out.println(Sorting.sortByCost(filter));
    }

    static void addGoods(List<Laptop> goods){
        goods.add(new Laptop(
                Processor.AMD_Ryzen_7_7700X,
                RAM.Corsair_CMSA4GX3M1A1066C7,
                HardDisk.HGST_500_GB_Travelstar_Z7K500,
                Motherboard.ASRock_B450_PRO4_R2_0,
                OperationSystem.Windows,
                Color.Orange,
                123487));
        goods.add(new Laptop(
                Processor.AMD_Ryzen_9_7845HX,
                RAM.Kingston_KVR800D2S6_2G,
                HardDisk.Seagate_Barracuda_1_TB,
                Motherboard.ASUS_PRIME_B450_PLUS,
                OperationSystem.FreeDOS,
                Color.Black,
                98876));
        goods.add(new Laptop(
                Processor.AMD_Ryzen_9_7950X,
                RAM.Kingston_ValueRAM_KVR16S11_8,
                HardDisk.Toshiba_1_TB_HDWL110UZSVA,
                Motherboard.ASUS_PRIME_B560M_K,
                OperationSystem.Ubuntu,
                Color.Yellow,
                48253));
    }
}