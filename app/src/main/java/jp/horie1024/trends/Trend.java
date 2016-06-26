package jp.horie1024.trends;

import java.util.List;

/**
 * @author horie
 */
public class Trend {

    public List<Item> items;

    public static class Item {
        public String name;
        public String description;
        public String language;
        public String watchersCount;
        public String htmlUrl;
    }
}
