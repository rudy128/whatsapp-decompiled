package X;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.EmojiPicker$EmojiWeight;
import com.whatsapp.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7IW  reason: invalid class name */
public class AnonymousClass7IW implements C1607289r {
    public final AnonymousClass118 A00;
    public final AnonymousClass190 A01;
    public final C18030ve A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.whatsapp.EmojiPicker$EmojiWeight, X.8AP] */
    public /* bridge */ /* synthetic */ AnonymousClass8AP BHM(Object obj, float f) {
        ? obj2 = new Object();
        obj2.A01 = (int[]) obj;
        obj2.A00 = f;
        return obj2;
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.Object, com.whatsapp.EmojiPicker$EmojiWeight] */
    public ArrayList Bd5() {
        JsonReader jsonReader;
        File A0e = C17880vN.A0e(this.A00.A00.getFilesDir(), "emoji");
        ArrayList arrayList = null;
        if (A0e.exists()) {
            try {
                ArrayList A13 = AnonymousClass000.A13();
                jsonReader = new JsonReader(new FileReader(A0e));
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if ("weights".equals(jsonReader.nextName())) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            AnonymousClass737 A002 = C137176v2.A00(jsonReader.nextName());
                            float nextDouble = (float) jsonReader.nextDouble();
                            int[] iArr = A002.A00;
                            ? obj = new Object();
                            obj.A01 = iArr;
                            obj.A00 = nextDouble;
                            A13.add(obj);
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                arrayList = A13;
                if (!C18020vd.A05(C18040vf.A02, this.A02, 2880)) {
                    Set set = (Set) C124576Yw.A00.get();
                    Iterator it = A13.iterator();
                    while (it.hasNext()) {
                        if (set.contains(new AnonymousClass737(AnonymousClass74I.A07(((EmojiPicker$EmojiWeight) it.next()).A01)))) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("recentemoji/readrecent ", e);
                this.A01.A0G("recentemoji/load-error", e.toString(), false);
                A0e.delete();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        if (arrayList == null) {
            return AnonymousClass000.A13();
        }
        return arrayList;
        throw th;
    }

    public void CBh(List list) {
        JsonWriter jsonWriter;
        try {
            File A0e = C17880vN.A0e(this.A00.A00.getFilesDir(), "emoji");
            AnonymousClass190 r5 = this.A01;
            jsonWriter = new JsonWriter(new BufferedWriter(new FileWriter(A0e)));
            jsonWriter.beginObject();
            jsonWriter.name("weights");
            jsonWriter.beginObject();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) it.next();
                int[] iArr = emojiPicker$EmojiWeight.A01;
                if (iArr == null) {
                    r5.A0G("RecentEmojiHelper/persistListJson/emoji is null", (String) null, true);
                } else {
                    jsonWriter.name(C137176v2.A01(iArr));
                    jsonWriter.value((double) emojiPicker$EmojiWeight.A00);
                }
            }
            jsonWriter.endObject();
            jsonWriter.endObject();
            jsonWriter.close();
            return;
        } catch (IOException e) {
            Log.e((Throwable) e);
            this.A01.A0G("recentemoji/save-error", e.toString(), false);
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public AnonymousClass7IW(AnonymousClass190 r1, AnonymousClass118 r2, C18030ve r3) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r1;
    }
}
