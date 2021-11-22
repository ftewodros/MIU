//package lab5;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AssetTracker {
//        List<Asset> assets = new ArrayList<Asset>();
//        public void add(Asset a) {
//            assets.add(a);
//        }
//        public void modify(Asset a) {
//            assets.set(assets.indexOf(a), a);
//        }
//        public void delete(Asset a) {
//            assets.remove(a);
//        }
//        public List<Asset> getAssets() {
//            return assets;
//        }
//        public Asset findAsset(String serialNumber) {
//            for(Asset a : assets) {
//                if(a.serialNumber.equals(serialNumber)) return a;
//            }
//            return null;
//        }
//    }
//
//
//
