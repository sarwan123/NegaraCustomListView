package id.ac.poliban.mi.sarwan;

import java.util.ArrayList;
import java.util.List;

public class CountryData {
    static List<Country> getAllCountry() {
        List<Country> data = new ArrayList<>();
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/125px-Flag_of_Indonesia.svg.png","Indonesia","Republik Indonesia (RI) atau Negara Kesatuan Republik Indonesia (NKRI), atau lebih umum disebut Indonesia, adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia. Indonesia adalah negara kepulauan terbesar di dunia yang terdiri dari 17.504 pulau.[11] Nama alternatif yang biasa dipakai adalah Nusantara.[12] Dengan populasi Hampir 270.054.853 jiwa pada tahun 2018,[13] Indonesia adalah negara berpenduduk terbesar keempat di dunia dan negara yang berpenduduk Muslim terbesar di dunia, dengan lebih dari 230 juta jiwa."));
        data.add(new Country("https://id.wikipedia.org/wiki/Berkas:Flag_of_Thailand.svg","Thailand","Kerajaan Thai (nama resmi bahasa Thai: ราชอาณาจักรไทย Ratcha Anachak Thai; atau Prathēt Thai), yang lebih sering disebut Thailand dalam bahasa Inggris, atau dalam bahasa aslinya Mueang Thai (dibaca: \"meng-thai\", sama dengan versi Inggrisnya, berarti \"Negeri Thai\"), adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat. Kerajaan Thai dahulu dikenal sebagai Siam sampai tanggal 11 Mei 1949. Kata \"Thai\" (ไทย) berarti \"kebebasan\" dalam bahasa Thai, tetapi juga dapat merujuk kepada suku Thai, sehingga menyebabkan nama Siam masih digunakan di kalangan warga negara Thai terutama kaum minoritas Tionghoa dan Amerika. "));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Flag_of_Malaysia.svg/125px-Flag_of_Malaysia.svg.png","Malaysia","https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Flag_of_Malaysia.svg/125px-Flag_of_Malaysia.svg.png"));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/125px-Flag_of_Japan.svg.png","Jepang","Jepang (Jepang: 日本 Nippon atau Nihon; nama resmi: 日本国 Tentang suara ini Nipponkoku atau Nihonkoku, nama harfiah: \"Negara Jepang\") adalah sebuah negara kepulauan di Asia Timur. Letaknya di ujung barat Samudra Pasifik, di sebelah timur Laut Jepang, dan bertetangga dengan Republik Rakyat Tiongkok, Korea, dan Rusia. Pulau-pulau paling utara berada di Laut Okhotsk, dan wilayah paling selatan berupa kelompok pulau-pulau kecil di Laut Tiongkok Timur, tepatnya di sebelah selatan Okinawa yang bertetangga dengan Taiwan."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Flag_of_Korea_%281882%E2%80%931910%29.svg/100px-Flag_of_Korea_%281882%E2%80%931910%29.svg.png","Korea","Korea adalah sebuah semenanjung yang di Asia Timur (di antara Tiongkok dan Jepang).[1][2][3] Korea terbagi menjadi dua negara, yakni Republik Korea (Korea Selatan) dan Republik Rakyat Demokratik Korea (Korea Utara) setelah Perang Dunia II pada tahun 1945. "));

        return data;
    }

}
