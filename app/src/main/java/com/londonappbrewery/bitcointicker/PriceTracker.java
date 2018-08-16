//package com.londonappbrewery.bitcointicker;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//public class PriceTracker {
//    public int fromJSON(JSONObject jsonObject){
//        try {
//            int price = Integer.parseInt(jsonObject.getString("ask"));
//            return price;
//        }catch (JSONException e){
//            e.printStackTrace();
//            return -1;
//        }
//    }
//}
