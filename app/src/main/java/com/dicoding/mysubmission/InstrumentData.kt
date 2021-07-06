package com.dicoding.mysubmission

object InstrumentData {

    private val instrumentName = arrayOf("Gendang","Gitar Klasik","Biola","Drum",
        "Akordeon","Harpa","Marakas","Rebana","Saksofon","Trompet")

    private  val jenisInstrument = arrayOf("Alat Musik Tradisional(dipukul)","Alat Musik(dipetik)","Alat Musik dawai(digesek)","Alat Musik(dipukul)","Alat Musik tuts(ditekan)","Alat Musik(dipetik)","Alat Musik(digoyang)",
        "Alat Musik(dipukul)","Alat Musik(ditiup)","Alat Musik Aerophone(ditiup)")

    private val bahanInstrument = arrayOf("Kayu dan kulit",
        "Kayu",
        "Kayu",
        "Kayu/Besi dan Kulit",
        "Logam",
        "Kayu",
        "Kulit/Kayu",
        "Kayu dan Kulit",
        "Kuningan",
        "Kuningan")

    private val tahunPembuatan = arrayOf("9M", "Abad-19M","Abad-16M", "1909M", "1822M", "3000SM","-","Abad-6M","1840M","Abad-15")

    private val detailInstrument = arrayOf("Gendang merupakan salah satu alat musik yang digunakan pada pagelaran musik gamelan. Alat musik gendang dimainkan dengan cara dipukul atau diketuk pada bagian kulit yang ada di sisi kanan dan kiri alat musik.",
        "Gitar klasik adalah jenis gitar akustik yang biasanya digunakan dalam musik klasik. Gitar ini memiliki ciri khas pada senarnya yang terbuat dari nilon dan pada umumnya memiliki 19 fret.",
        "Biola adalah sebuah alat musik dawai yang dimainkan dengan cara digesek. Biola memiliki empat senar (G-D-A-E) yang disetel berbeda satu sama lain dengan interval sempurna kelima. Nada yang paling rendah adalah G. Di antara keluarga biola, yaitu dengan biola alto, cello dan double bass atau kontra bass.",
        "Drum adalah kelompok alat musik perkusi yang terdiri dari kulit yang direntangkan dan dipukul dengan tangan atau sebuah batang. Selain kulit, drum juga digunakan dari bahan lain, misalnya plastik.",
        "Akordeon adalah sebuah alat musik tuts sejenis organ. Akordeon ini relatif kecil dan dimainkan dengan cara digantungkan di badan.",
        "Harpa atau dalam bahasa Inggris disebut dengan Harp adalah jenis alat musik petik. Seringkali alat musik ini diilustrasikan bersama dengan para malaikat. Bentuknya tinggi, umumnya berwarna emas, dan memiliki senar. Biasanya berbentuk dasar segitiga. Seringkali hadir bersamaan dengan orkestra simfoni, bersamaan dengan suara vokal, suara flute, atau bisa juga dengan jazz bass dan drum.",
        "Marakas adalah salah satu instrumen musik dalam Orkes Samrah atau Harmonium, dan pertunjukan Wayang Dermuluk. Berdasarkan suara yang dihasilkannya, marakas tergolong “idiofon” dimana sumber suara berasal dari fisik alat musiknya itu sendiri, yaitu dengan cara digoyang-goyangkan atau diguncangkan.",
        "Rebana adalah gendang berbentuk bundar dan pipih yang merupakan khas suku melayu. Bingkai berbentuk lingkaran terbuat dari kayu yang dibubut, dengan salah satu sisi untuk ditepuk berlapis kulit kambing.",
        "Saksofon atau seksofon adalah alat musik tiup kayu yang terbuat dari kuningan, berbentuk seperti cangklong rokok, dan memiliki mulut tiup buluh tunggal.",
        "Trompet adalah alat musik tiup logam. Terletak pada jajaran tertinggi di antara tuba, eufonium, trombon, sousafon, French horn, dan Bariton.Trompet hanya memiliki tiga tombol, dan pemain trompet harus menyesuaikan embouchure untuk mendapatkan nada yang berbeda.")

    private val instrumentImage = intArrayOf(R.drawable.kendang,
        R.drawable.guitar,
        R.drawable.biola,
        R.drawable.drum,
        R.drawable.harmo,
        R.drawable.kayabiola,
        R.drawable.kicrik,
        R.drawable.rebana,
        R.drawable.terompet2,
        R.drawable.terompet3)

    val listData:ArrayList<Instrument>
        get() {
            val list = arrayListOf<Instrument>()
            for (position in instrumentName.indices){
                val alatMusik = Instrument()
                alatMusik.name = instrumentName[position]
                alatMusik.jenis = jenisInstrument[position]
                alatMusik.bahan = bahanInstrument[position]
                alatMusik.tahun = tahunPembuatan[position]
                alatMusik.detail = detailInstrument[position]
                alatMusik.photo = instrumentImage[position]

                list.add(alatMusik)
            }
            return list
        }
}


