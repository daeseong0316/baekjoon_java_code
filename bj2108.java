import java.util.*;

public class bj2108 {
    // »ê¼ú Æò±Õ
    public static int mod(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return Math.round((float) sum / list.size());
    }

    // Áß¾Ó°ª
    public static int mid(List<Integer> list) {
        List<Integer> copy = new ArrayList<>(list); 
        Collections.sort(copy);
        return copy.get(copy.size() / 2);
    }

    // ÃÖºó°ª
    public static int modeWhich(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = Collections.max(map.values());

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes);

        if (modes.size() > 1) {
            return modes.get(1);
        } else {
            return modes.get(0);
        }
    }

    // ¹üÀ§
    public static int range(List<Integer> list) {
        int max = Collections.max(list);
        int min = Collections.min(list);
        return max - min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(mod(list));      
        System.out.println(mid(list));       
        System.out.println(modeWhich(list)); 
        System.out.println(range(list));    
    }
}
