package X;

import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7IY  reason: invalid class name */
public class AnonymousClass7IY implements C1607289r {
    public final C25311Ns A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass1KW A02;
    public final C26631Sw A03;
    public final AnonymousClass00H A04;
    public final Map A05 = new ConcurrentHashMap();

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.8AP, X.7IZ] */
    public /* bridge */ /* synthetic */ AnonymousClass8AP BHM(Object obj, float f) {
        Float valueOf = Float.valueOf(f);
        ? obj2 = new Object();
        obj2.A01 = (AnonymousClass8B0) obj;
        obj2.A00 = valueOf.floatValue();
        return obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: X.7JD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: X.7JD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: X.7JE} */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object, X.7IZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r0 == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0179, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:76:0x0160, B:90:0x0175] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079 A[Catch:{ all -> 0x0169, all -> 0x016e, all -> 0x0173 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090 A[Catch:{ all -> 0x0169, all -> 0x016e, all -> 0x0173 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList Bd5() {
        /*
            r17 = this;
            r7 = r17
            X.118 r0 = r7.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "content_stickers"
            java.io.File r16 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r16.exists()
            r15 = 0
            if (r0 == 0) goto L_0x0199
            java.io.FileInputStream r4 = X.C108945cZ.A18(r16)     // Catch:{ Exception -> 0x018b }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ all -> 0x0180 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x0180 }
            r5.<init>(r4, r0)     // Catch:{ all -> 0x0180 }
            android.util.JsonReader r6 = new android.util.JsonReader     // Catch:{ all -> 0x0173 }
            r6.<init>(r5)     // Catch:{ all -> 0x0173 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0169 }
            r6.beginArray()     // Catch:{ all -> 0x0169 }
        L_0x002e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x015d
            r6.beginObject()     // Catch:{ all -> 0x0169 }
            r8 = r15
            r14 = r15
            r9 = r15
        L_0x003a:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0169 }
            r13 = 1
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = r6.nextName()     // Catch:{ all -> 0x0169 }
            int r10 = r1.hashCode()     // Catch:{ all -> 0x0169 }
            r0 = -1391167122(0xffffffffad14796e, float:-8.439789E-12)
            r2 = 2
            if (r10 == r0) goto L_0x006d
            r0 = -791592328(0xffffffffd0d14278, float:-2.80863539E10)
            if (r10 == r0) goto L_0x0063
            r0 = 114586(0x1bf9a, float:1.60569E-40)
            if (r10 != r0) goto L_0x0076
            java.lang.String r0 = "tag"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0169 }
            r1 = 0
            if (r0 != 0) goto L_0x0077
            goto L_0x0076
        L_0x0063:
            java.lang.String r0 = "weight"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0169 }
            r1 = 1
            if (r0 != 0) goto L_0x0077
            goto L_0x0076
        L_0x006d:
            java.lang.String r0 = "mimetype"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0169 }
            r1 = 2
            if (r0 != 0) goto L_0x0077
        L_0x0076:
            r1 = -1
        L_0x0077:
            if (r1 == 0) goto L_0x0090
            if (r1 == r13) goto L_0x0086
            if (r1 == r2) goto L_0x0081
            r6.skipValue()     // Catch:{ all -> 0x0169 }
            goto L_0x003a
        L_0x0081:
            java.lang.String r9 = r6.nextString()     // Catch:{ all -> 0x0169 }
            goto L_0x003a
        L_0x0086:
            double r0 = r6.nextDouble()     // Catch:{ all -> 0x0169 }
            float r2 = (float) r0     // Catch:{ all -> 0x0169 }
            java.lang.Float r14 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0169 }
            goto L_0x003a
        L_0x0090:
            java.lang.String r8 = r6.nextString()     // Catch:{ all -> 0x0169 }
            goto L_0x003a
        L_0x0095:
            r6.endObject()     // Catch:{ all -> 0x0169 }
            if (r8 == 0) goto L_0x0152
            if (r14 == 0) goto L_0x0152
            java.util.Map r2 = r7.A05     // Catch:{ all -> 0x0169 }
            java.lang.Object r10 = r2.get(r8)     // Catch:{ all -> 0x0169 }
            X.8B0 r10 = (X.AnonymousClass8B0) r10     // Catch:{ all -> 0x0169 }
            if (r10 != 0) goto L_0x0138
            java.lang.String r1 = "StickerShapeCreator:"
            boolean r0 = r8.startsWith(r1)     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = ""
            java.lang.String r12 = r8.replace(r1, r0)     // Catch:{ all -> 0x0169 }
            goto L_0x00b6
        L_0x00b5:
            r12 = 0
        L_0x00b6:
            if (r12 == 0) goto L_0x0104
            X.1Ns r0 = r7.A00     // Catch:{ all -> 0x0169 }
            java.io.File r11 = r0.A04(r12, r9)     // Catch:{ all -> 0x0169 }
            boolean r0 = r11.exists()     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x0138
            X.77d r1 = new X.77d     // Catch:{ all -> 0x0169 }
            r1.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ all -> 0x0169 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x00d5
            r0 = r15
            goto L_0x00e1
        L_0x00d5:
            X.00H r0 = r7.A04     // Catch:{ all -> 0x0169 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0169 }
            X.70H r0 = (X.AnonymousClass70H) r0     // Catch:{ all -> 0x0169 }
            X.73B r0 = r0.A02(r11, r9)     // Catch:{ all -> 0x0169 }
        L_0x00e1:
            r1.A04 = r0     // Catch:{ all -> 0x0169 }
            r1.A0F = r12     // Catch:{ all -> 0x0169 }
            X.C108945cZ.A1O(r1, r11)     // Catch:{ all -> 0x0169 }
            r1.A01 = r13     // Catch:{ all -> 0x0169 }
            r1.A0E = r9     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0169 }
            r1.A0Q = r0     // Catch:{ all -> 0x0169 }
            X.00H r0 = r7.A04     // Catch:{ all -> 0x0169 }
            X.AnonymousClass70H.A00(r1, r0)     // Catch:{ all -> 0x0169 }
            X.1Sw r0 = r7.A03     // Catch:{ all -> 0x0169 }
            X.7JE r9 = new X.7JE     // Catch:{ all -> 0x0169 }
            r9.<init>(r1, r0)     // Catch:{ all -> 0x0169 }
            r2.put(r8, r9)     // Catch:{ all -> 0x0169 }
            goto L_0x0137
        L_0x0104:
            java.lang.String r1 = "EmojiShapeCreator:"
            boolean r0 = r8.startsWith(r1)     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = ""
            java.lang.String r8 = r8.replace(r1, r0)     // Catch:{ all -> 0x0169 }
            goto L_0x0114
        L_0x0113:
            r8 = 0
        L_0x0114:
            if (r8 == 0) goto L_0x0138
            X.1KW r1 = r7.A02     // Catch:{ IllegalArgumentException -> 0x012c }
            X.737 r0 = new X.737     // Catch:{ IllegalArgumentException -> 0x012c }
            r0.<init>((java.lang.String) r8)     // Catch:{ IllegalArgumentException -> 0x012c }
            X.7JD r9 = new X.7JD     // Catch:{ IllegalArgumentException -> 0x012c }
            r9.<init>(r0, r1)     // Catch:{ IllegalArgumentException -> 0x012c }
            java.lang.String r0 = r9.Ba8()     // Catch:{ IllegalArgumentException -> 0x012a }
            r2.put(r0, r9)     // Catch:{ IllegalArgumentException -> 0x012a }
            goto L_0x0137
        L_0x012a:
            r2 = move-exception
            goto L_0x012e
        L_0x012c:
            r2 = move-exception
            r9 = r10
        L_0x012e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "Unable to create emoji shape creator from "
            X.C17900vP.A0h(r0, r8, r1, r2)     // Catch:{ all -> 0x0169 }
        L_0x0137:
            r10 = r9
        L_0x0138:
            if (r10 == 0) goto L_0x002e
            boolean r0 = r10.BE6()     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x002e
            X.7IZ r1 = new X.7IZ     // Catch:{ all -> 0x0169 }
            r1.<init>()     // Catch:{ all -> 0x0169 }
            r1.A01 = r10     // Catch:{ all -> 0x0169 }
            float r0 = r14.floatValue()     // Catch:{ all -> 0x0169 }
            r1.A00 = r0     // Catch:{ all -> 0x0169 }
            r3.add(r1)     // Catch:{ all -> 0x0169 }
            goto L_0x002e
        L_0x0152:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "RecentShapesHelper/init/ tag or weight is null for tag="
            X.C17900vP.A0e(r0, r8, r1)     // Catch:{ all -> 0x0169 }
            goto L_0x002e
        L_0x015d:
            r6.close()     // Catch:{ all -> 0x0167 }
            r5.close()     // Catch:{ all -> 0x017e }
            r4.close()     // Catch:{ Exception -> 0x018d }
            goto L_0x0198
        L_0x0167:
            r1 = move-exception
            goto L_0x0175
        L_0x0169:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x016e }
            goto L_0x0172
        L_0x016e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0173 }
        L_0x0172:
            throw r1     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r1 = move-exception
            r3 = r15
        L_0x0175:
            r5.close()     // Catch:{ all -> 0x0179 }
            goto L_0x017d
        L_0x0179:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x017e }
        L_0x017d:
            throw r1     // Catch:{ all -> 0x017e }
        L_0x017e:
            r1 = move-exception
            goto L_0x0182
        L_0x0180:
            r1 = move-exception
            r3 = r15
        L_0x0182:
            r4.close()     // Catch:{ all -> 0x0186 }
            goto L_0x018a
        L_0x0186:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x018d }
        L_0x018a:
            throw r1     // Catch:{ Exception -> 0x018d }
        L_0x018b:
            r1 = move-exception
            goto L_0x018f
        L_0x018d:
            r1 = move-exception
            r15 = r3
        L_0x018f:
            java.lang.String r0 = "RecentShapesHelper/init"
            com.whatsapp.util.Log.e(r0, r1)
            r16.delete()
            goto L_0x0199
        L_0x0198:
            r15 = r3
        L_0x0199:
            if (r15 != 0) goto L_0x019f
            java.util.ArrayList r15 = X.AnonymousClass000.A13()
        L_0x019f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IY.Bd5():java.util.ArrayList");
    }

    public void CBh(List list) {
        JsonWriter jsonWriter;
        String str;
        try {
            FileOutputStream A19 = C108945cZ.A19(C17880vN.A0e(this.A01.A00.getFilesDir(), "content_stickers"));
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(A19, C19620yd.A0A);
                try {
                    jsonWriter = new JsonWriter(outputStreamWriter);
                    jsonWriter.setIndent("");
                    jsonWriter.beginArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass7IZ r7 = (AnonymousClass7IZ) it.next();
                        AnonymousClass8B0 r2 = r7.A01;
                        if (r2 instanceof AnonymousClass7JE) {
                            str = ((AnonymousClass7JE) r2).A00.A0E;
                        } else {
                            str = null;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("tag").value(r2.Ba8());
                        jsonWriter.name("weight").value((double) r7.A00);
                        if (str != null) {
                            jsonWriter.name("mimetype").value(str);
                        }
                        jsonWriter.endObject();
                    }
                    jsonWriter.endArray();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    A19.close();
                    return;
                } catch (Throwable th) {
                    outputStreamWriter.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A19.close();
                throw th2;
            }
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th2, th3);
        }
    }

    public AnonymousClass7IY(C25311Ns r5, AnonymousClass118 r6, AnonymousClass1KW r7, C18030ve r8, C26631Sw r9, AnonymousClass00H r10) {
        this.A01 = r6;
        this.A02 = r7;
        this.A04 = r10;
        this.A03 = r9;
        this.A00 = r5;
        ArrayList A002 = AnonymousClass711.A00(r8);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            AnonymousClass8B0 r2 = (AnonymousClass8B0) it.next();
            this.A05.put(r2.Ba8(), r2);
        }
    }
}
