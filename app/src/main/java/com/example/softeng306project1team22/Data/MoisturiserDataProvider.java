package com.example.softeng306project1team22.Data;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.softeng306project1team22.Models.Category;
import com.example.softeng306project1team22.Models.IItem;
import com.example.softeng306project1team22.Models.Moisturiser;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MoisturiserDataProvider {

    public static FirebaseFirestore database = FirebaseFirestore.getInstance();

    public static Map<String, ArrayList<Object>> getMoisturisersInfo() {
        Map<String, ArrayList<Object>> moisturisersInfo = new LinkedHashMap<String, ArrayList<Object>>();

        moisturisersInfo.put("mos1", new ArrayList<Object>(
                Arrays.asList(
                        "1025 Dokdo Cream",
                        "Round Lab",
                        new ArrayList<String>(Arrays.asList("mos1_img1.png", "mos1_img2.png", "mos1_img3.png")),
                        47.0,
                        new Category("1025 Dokdo Cream", "mos1", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Dry", "Sensitive")),
                        "Cream",
                        "Apply to face after cleansing.",
                        "Daytime"
                )
        ));
        moisturisersInfo.put("mos2", new ArrayList<Object>(
                Arrays.asList(
                        "Advanced Snail 92 All in one Cream",
                        "COSRX",
                        new ArrayList<String>(Arrays.asList("mos2_img1.png", "mos2_img2.png", "mos2_img3.png")),
                        30.0,
                        new Category("Advanced Snail 92 All in one Cream", "mos2", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Normal", "Dry", "Combination")),
                        "Cream",
                        "Cleanse and dry area around acne and pimples. Apply a patch to the area.",
                        "Night time"
                )
        ));
        moisturisersInfo.put("mos3", new ArrayList<Object>(
                Arrays.asList(
                        "Aloe Real Cool Soothing Gel",
                        "Benton",
                        new ArrayList<String>(Arrays.asList("mos3_img1.png", "mos3_img2.png", "mos3_img3.png")),
                        12.0,
                        new Category("Aloe Real Cool Soothing Gel", "mos3", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Sensitive", "Combination")),
                        "Gel",
                        "Apply generously to face, body or scalp then gently pat until absorbed.",
                        "Daytime"
                )
        ));
        moisturisersInfo.put("mos4", new ArrayList<Object>(
                Arrays.asList(
                        "AC Collection Lightweight Soothing Moisturiser",
                        "COSRX",
                        new ArrayList<String>(Arrays.asList("mos4_img1.png", "mos4_img2.png", "mos4_img3.png")),
                        30.0,
                        new Category("AC Collection Lightweight Soothing Moisturiser", "mos4", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Dry", "Oily", "Sensitive", "Combination")),
                        "Cream",
                        "Gently apply a proper amount of the cream onto face after cleansing and toning, avoiding eye area. Tap the area for better absorption.",
                        "Night time"
                )
        ));
        moisturisersInfo.put("mos5", new ArrayList<Object>(
                Arrays.asList(
                        "Fundamental Water Gel Cream",
                        "Klairs",
                        new ArrayList<String>(Arrays.asList("mos5_img1.png", "mos5_img2.png", "mos5_img3.png")),
                        48.0,
                        new Category("Fundamental Water Gel Cream", "mos5", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Normal", "Combination")),
                        "Gel",
                        "Apply adequate amount at last stage of skin care routine, after cleansing",
                        "Night time"
                )
        ));
        moisturisersInfo.put("mos6", new ArrayList<Object>(
                Arrays.asList(
                        "Birch Juice Moisturising Cream",
                        "Round Lab",
                        new ArrayList<String>(Arrays.asList("mos6_img1.png", "mos6_img2.png", "mos6_img3.png")),
                        43.0,
                        new Category("Birch Juice Moisturising Cream", "mos6", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Normal", "Dry", "Sensitive", "Combination")),
                        "Cream",
                        "At the last step of skincare, apply appropriate amount to skin to create moisture barrier. Allow for absorption.",
                        "Daytime"
                )
        ));
        moisturisersInfo.put("mos7", new ArrayList<Object>(
                Arrays.asList(
                        "Dermide Balancing Barrier Balm",
                        "Purito",
                        new ArrayList<String>(Arrays.asList("mos7_img1.png", "mos7_img2.png", "mos7_img3.png")),
                        40.0,
                        new Category("Dermide Balancing Barrier Balm", "mos7", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Normal", "Dry")),
                        "Balm",
                        "Apply every morning and evening, gently pressing onto dry skin",
                        "Daytime and Night time"
                )
        ));
        moisturisersInfo.put("mos8", new ArrayList<Object>(
                Arrays.asList(
                        "Clean Lotus Water Cream",
                        "Rovectin",
                        new ArrayList<String>(Arrays.asList("mos8_img1.png", "mos8_img2.png", "mos8_img3.png")),
                        27.0,
                        new Category("Clean Lotus Water Cream", "mos8", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Oily", "Sensitive", "Dry", "Combination")),
                        "Cream",
                        "After cleansing, toning and treatment products, apply gently over the skin. If skin is very dry, apply a thicker layer for added moisture.",
                        "Daytime and Night time"
                )
        ));
        moisturisersInfo.put("mos9", new ArrayList<Object>(
                Arrays.asList(
                        "Cicaluronic Gel Treatment",
                        "Mizon",
                        new ArrayList<String>(Arrays.asList("mos9_img1.png", "mos9_img2.png", "mos9_img3.png")),
                        36.0,
                        new Category("Cicaluronic Gel Treatment", "mos9", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Sensitive")),
                        "Gel",
                        "Gently apply to face, avoiding eye and mouth area. Tap the areas where the cream was applied in order for it to be absorbed. Reapply the cream on extremely dry areas.",
                        "Daytime"
                )
        ));
        moisturisersInfo.put("mos10", new ArrayList<Object>(
                Arrays.asList(
                        "Ceramidin Oil Balm",
                        "Dr.Jart+",
                        new ArrayList<String>(Arrays.asList("mos10_img1.png", "mos10_img2.png", "mos10_img3.png")),
                        43.0,
                        new Category("Ceramidin Oil Balm", "mos1", "mos.png"),
                        new ArrayList<String>(Arrays.asList("Dry")),
                        "Oil Balm",
                        "Gently apply on dry skin.",
                        "Daytime and Night time"
                )
        ));

        return moisturisersInfo;
    }

    public static void addMoisturisersToFirestore() {

        List<IItem> moisturisersList = getMoisturisers();

        for (IItem moisturiser : moisturisersList) {
            database.collection("moisturiser").document(moisturiser.getId()).set(moisturiser).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void unused) {
                    Log.d("Moisturiser Collection", moisturiser.getId() + " added");
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.w("Moisturiser Collection", moisturiser.getId() + " could not be added");
                }
            });
        }
    }

    public static List<IItem> getMoisturisers() {
        List<IItem> moisturisersList = new ArrayList<IItem>();
        Map<String, ArrayList<Object>> moisturisersInfo = getMoisturisersInfo();

        for (String key : moisturisersInfo.keySet()) {
            String name = (String) moisturisersInfo.get(key).get(0);
            String brand = (String) moisturisersInfo.get(key).get(1);
            ArrayList<String> imageUri = (ArrayList<String>) moisturisersInfo.get(key).get(2);
            double price = (double) moisturisersInfo.get(key).get(3);
            Category category = (Category) moisturisersInfo.get(key).get(4);
            ArrayList<String> skinType = (ArrayList<String>) moisturisersInfo.get(key).get(5);
            String moisturiserType = (String) moisturisersInfo.get(key).get(6);
            String howToUse = (String) moisturisersInfo.get(key).get(7);
            String timeToUse = (String) moisturisersInfo.get(key).get(8);

            Moisturiser moisturiser = new Moisturiser(key, name, brand, imageUri, price, category, skinType, moisturiserType, howToUse, timeToUse);
            moisturisersList.add(moisturiser);
        }

        return moisturisersList;
    }
}

