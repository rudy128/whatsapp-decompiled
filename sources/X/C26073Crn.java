package X;

import android.util.Log;

/* renamed from: X.Crn  reason: case insensitive filesystem */
public abstract class C26073Crn {
    public static final String[] A00 = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static D9F A00(C26207Cui cui, String str, int i, boolean z, boolean z2) {
        int i2;
        cui.A0J(4);
        if (cui.A03() == 1684108385) {
            i2 = C26207Cui.A01(cui, 8);
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            String num = Integer.toString(i2);
            if (z) {
                return new C22776BOp(str, num);
            }
            return new C22777BOq(str, num);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failed to parse uint8 attribute: ");
        Log.w("MetadataUtil", AnonymousClass000.A0y(C25973Cpg.A00(i), A10));
        return null;
    }

    public static C22776BOp A01(C26207Cui cui, String str, int i) {
        int A03 = cui.A03();
        if (cui.A03() == 1684108385 && A03 >= 22) {
            cui.A0J(10);
            int A06 = cui.A06();
            if (A06 > 0) {
                String A1I = AnonymousClass001.A1I("", AnonymousClass000.A10(), A06);
                int A062 = cui.A06();
                if (A062 > 0) {
                    A1I = AnonymousClass001.A1I("/", AnonymousClass000.A11(A1I), A062);
                }
                return new C22776BOp(str, A1I);
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failed to parse index/count attribute: ");
        Log.w("MetadataUtil", AnonymousClass000.A0y(C25973Cpg.A00(i), A10));
        return null;
    }

    public static C22776BOp A02(C26207Cui cui, String str, int i) {
        int A03 = cui.A03();
        if (cui.A03() == 1684108385) {
            cui.A0J(8);
            return new C22776BOp(str, cui.A0D(A03 - 16));
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failed to parse text attribute: ");
        Log.w("MetadataUtil", AnonymousClass000.A0y(C25973Cpg.A00(i), A10));
        return null;
    }
}
