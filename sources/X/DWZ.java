package X;

public class DWZ implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DWZ(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0167, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0205;
                case 1: goto L_0x022f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r12.A01
            X.DOr r7 = (X.C26995DOr) r7
            java.lang.Object r8 = r12.A02
            java.lang.Object r6 = r12.A03
            X.A99 r6 = (X.A99) r6
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A07
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0224
            java.lang.String r0 = "sup:VOIPGlassesPlugin.kt Resource downloading complete."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "sup:VOIPGlassesPlugin.kt Initializing Sup Delegate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vp r0 = r7.A0R
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0075
            X.E9o r0 = r7.A02
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "supDelegate should not be null when using the voice service level glasses service"
            X.C17960vV.A0F(r1, r0)
        L_0x0039:
            X.0vb r2 = r7.A0K
            java.lang.String r0 = r2.A05()
            r1 = 0
            X.C25970Cpd.A00 = r0
            java.lang.String r0 = r2.A06()
            X.C18070vi.A0d(r0, r1)
            X.C25970Cpd.A01 = r0
            X.118 r0 = r7.A0I
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getPackageName()
            X.C18070vi.A0d(r0, r1)
            X.C0L r3 = X.C0L.A16
            X.00H r4 = r7.A0Q
            java.lang.Object r2 = X.C18070vi.A0E(r4)
            X.A1I r2 = (X.A1I) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            java.lang.String r1 = X.C25970Cpd.A00
            java.lang.String r0 = "en"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0172
            java.io.File r0 = r2.A01(r3)
            if (r0 == 0) goto L_0x0172
            goto L_0x00d6
        L_0x0075:
            X.CLo r5 = r7.A0M
            X.E9o r0 = r5.A00
            r4 = 0
            if (r0 != 0) goto L_0x00a2
            X.2hd r0 = r7.A0F
            X.DOs r0 = r0.A00()
            r5.A00 = r0
        L_0x0084:
            X.E9o r1 = r5.A00
            if (r1 == 0) goto L_0x008d
            r0 = r1
            X.DOs r0 = (X.C26996DOs) r0
            r0.A02 = r6
        L_0x008d:
            r7.A02 = r1
            com.whatsapp.voipcalling.CallInfo r1 = r7.A06
            if (r1 == 0) goto L_0x009f
            java.lang.String r0 = "sup:VOIPGlassesPlugin.kt Applying cached call info to sup delegate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.E9o r0 = r7.A02
            if (r0 == 0) goto L_0x009f
            r0.CQY(r1)
        L_0x009f:
            r7.A06 = r4
            goto L_0x0039
        L_0x00a2:
            java.lang.String r0 = "sup:VOIPGlassesPlugin.kt Sup Delegate already exists."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.E9o r0 = r5.A00
            if (r0 == 0) goto L_0x00d4
            X.DOs r0 = (X.C26996DOs) r0
            com.facebook.wearable.mediastream.model.SUPToggleState r0 = r0.A01
        L_0x00af:
            X.BXh r1 = X.C22961BXh.A00
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0084
            X.E9o r3 = r5.A00
            if (r3 == 0) goto L_0x0084
            X.DOs r3 = (X.C26996DOs) r3
            com.facebook.wearable.mediastream.model.SUPToggleState r0 = r3.A01
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0084
            r2 = 0
            X.BXe r1 = new X.BXe
            r1.<init>(r3, r2)
            java.lang.String r0 = "sup:SUPDelegate_ON_DISCOVERED_CALLBACK"
            X.C26996DOs.A01(r1, r3, r0)
            r3.A0C(r2)
            goto L_0x0084
        L_0x00d4:
            r0 = r4
            goto L_0x00af
        L_0x00d6:
            java.lang.String r0 = r0.getPath()     // Catch:{ IOException -> 0x016c }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x016c }
            java.util.LinkedHashMap r3 = X.C17880vN.A13()     // Catch:{ IOException -> 0x016c }
            java.io.File r1 = X.C108945cZ.A17(r0)     // Catch:{ IOException -> 0x016c }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x016c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x016c }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ IOException -> 0x016c }
            r5.<init>(r0)     // Catch:{ IOException -> 0x016c }
            r0 = 1
            r5.setLenient(r0)     // Catch:{ all -> 0x0165 }
            r5.beginObject()     // Catch:{ all -> 0x0165 }
        L_0x00f6:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0144
            java.lang.String r6 = r5.nextName()     // Catch:{ all -> 0x0165 }
            android.util.JsonToken r1 = r5.peek()     // Catch:{ all -> 0x0165 }
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ all -> 0x0165 }
            if (r1 != r0) goto L_0x0140
            java.lang.String r0 = X.C25970Cpd.A00     // Catch:{ all -> 0x0165 }
            boolean r0 = X.C18070vi.A18(r6, r0)     // Catch:{ all -> 0x0165 }
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = X.C25970Cpd.A01     // Catch:{ all -> 0x0165 }
            boolean r0 = X.C18070vi.A18(r6, r0)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0140
        L_0x0118:
            java.util.LinkedHashMap r2 = X.C17880vN.A13()     // Catch:{ all -> 0x0165 }
            r5.beginObject()     // Catch:{ all -> 0x0165 }
        L_0x011f:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r1 = r5.nextName()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0165 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0165 }
            goto L_0x011f
        L_0x0131:
            r5.endObject()     // Catch:{ all -> 0x0165 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0165 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f6
            r3.put(r6, r2)     // Catch:{ all -> 0x0165 }
            goto L_0x00f6
        L_0x0140:
            r5.skipValue()     // Catch:{ all -> 0x0165 }
            goto L_0x00f6
        L_0x0144:
            r5.endObject()     // Catch:{ all -> 0x0165 }
            r5.close()     // Catch:{ IOException -> 0x016c }
            java.lang.String r0 = X.C25970Cpd.A01     // Catch:{ IOException -> 0x016c }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ IOException -> 0x016c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IOException -> 0x016c }
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = X.C25970Cpd.A00     // Catch:{ IOException -> 0x016c }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ IOException -> 0x016c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IOException -> 0x016c }
            if (r0 != 0) goto L_0x0162
            java.util.LinkedHashMap r0 = X.C17880vN.A13()     // Catch:{ IOException -> 0x016c }
        L_0x0162:
            X.C25970Cpd.A02 = r0     // Catch:{ IOException -> 0x016c }
            goto L_0x0172
        L_0x0165:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ IOException -> 0x016c }
            throw r0     // Catch:{ IOException -> 0x016c }
        L_0x016c:
            r1 = move-exception
            java.lang.String r0 = "sup:NetworkStringTranslator"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0172:
            X.E9o r2 = r7.A02
            if (r2 == 0) goto L_0x018c
            r1 = 0
            X.DOs r2 = (X.C26996DOs) r2
            boolean r0 = r2.A09
            if (r0 == r1) goto L_0x018c
            r2.A09 = r1
            X.CvH r1 = r2.A0E
            boolean r0 = r2.A06
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r0 = r0 ^ 1
            r1.A0F(r0)
        L_0x018c:
            java.util.Map r0 = X.C26995DOr.A0V
            java.util.Set r1 = r0.keySet()
            java.lang.Object r3 = X.C18070vi.A0E(r4)
            X.A1I r3 = (X.A1I) r3
            X.C18070vi.A0h(r1, r3)
            int r0 = X.C200510q.A00(r1)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x01a8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.C0L r0 = (X.C0L) r0
            android.graphics.Bitmap r0 = X.C197219wL.A00(r3, r0)
            r9.put(r1, r0)
            goto L_0x01a8
        L_0x01bd:
            java.util.Set r1 = X.C26995DOr.A0W
            java.lang.Object r3 = X.C18070vi.A0E(r4)
            X.A1I r3 = (X.A1I) r3
            X.C18070vi.A0h(r1, r3)
            int r0 = X.C200510q.A00(r1)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x01d5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.C0L r0 = (X.C0L) r0
            android.graphics.Bitmap r0 = X.C197219wL.A00(r3, r0)
            r10.put(r1, r0)
            goto L_0x01d5
        L_0x01ea:
            X.C0L r1 = X.C0L.A0z
            java.lang.Object r0 = X.C18070vi.A0E(r4)
            X.A1I r0 = (X.A1I) r0
            android.graphics.Bitmap r0 = X.C197219wL.A00(r0, r1)
            r7.A01 = r0
            X.1KB r0 = r7.A0G
            r11 = 40
            X.3Cr r6 = new X.3Cr
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (int) r11)
            r0.A0J(r6)
            goto L_0x0229
        L_0x0205:
            java.lang.Object r2 = r12.A02
            X.DOZ r2 = (X.DOZ) r2
            java.lang.Object r1 = r12.A03
            X.DFL r1 = (X.DFL) r1
            X.CqB r0 = X.C25995CqB.A00()
            X.Cwg r0 = r0.A08
            java.lang.Object r0 = r0.A0D(r2, r1)
            if (r0 != 0) goto L_0x022e
            X.CqB r0 = X.C25995CqB.A00()
            X.ClP r0 = r0.A05
            java.lang.Object r0 = r0.A02(r2, r1)
            return r0
        L_0x0224:
            java.lang.String r0 = "sup:VOIPGlassesPlugin.kt Already downloaded resources. Skip init"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0229:
            r0 = 0
            r7.A09 = r0
            X.1Wu r0 = X.C27621Wu.A00
        L_0x022e:
            return r0
        L_0x022f:
            java.lang.Object r2 = r12.A01
            X.DFL r2 = (X.DFL) r2
            java.lang.Object r1 = r12.A02
            X.E9O r1 = (X.E9O) r1
            java.lang.Object r0 = r12.A03
            X.E87 r0 = (X.E87) r0
            X.DFL r0 = A00(r1, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DWZ.invoke():java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.DFL.A00(r2, 153) != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1 == 13336) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.DFL A00(X.E9O r13, X.E87 r14, X.DFL r15) {
        /*
            X.DFL r2 = r14.BCM(r13, r15)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 135(0x87, float:1.89E-43)
            java.lang.Object r0 = X.DFL.A00(r2, r0)
            if (r0 != 0) goto L_0x0019
            r0 = 153(0x99, float:2.14E-43)
            java.lang.Object r0 = X.DFL.A00(r2, r0)
            r13 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r13 = 1
        L_0x001a:
            X.C25995CqB.A00()
            int r1 = r2.A05
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r1 == r0) goto L_0x0028
            r0 = 13336(0x3418, float:1.8688E-41)
            r12 = 0
            if (r1 != r0) goto L_0x0029
        L_0x0028:
            r12 = 1
        L_0x0029:
            java.util.HashSet r3 = X.C17880vN.A12()
            X.C25995CqB.A00()
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r1 == r0) goto L_0x0038
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r1 != r0) goto L_0x003d
        L_0x0038:
            int r0 = r2.A04
            X.C17890vO.A1D(r3, r0)
        L_0x003d:
            X.Cke r0 = X.C25995CqB.A01()
            int[] r7 = r0.A01(r1)
            r6 = 0
        L_0x0046:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x0088
            r0 = r7[r6]
            X.DFL r1 = r2.A09(r0)
            if (r1 == 0) goto L_0x0085
            X.E9O r0 = r2.A01
            X.DFL r5 = A00(r0, r14, r1)
            if (r5 == r1) goto L_0x0064
            if (r2 != r15) goto L_0x005f
            X.DFL r2 = r15.A08()
        L_0x005f:
            r0 = r7[r6]
            r2.A0H(r0, r5)
        L_0x0064:
            int r4 = r5.A00
            r1 = 1
            r0 = r4 & 1
            if (r0 != 0) goto L_0x006c
            r1 = 0
        L_0x006c:
            r13 = r13 | r1
            r0 = r4 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r12 = r12 | r0
            java.util.Set r1 = r5.A03
            if (r1 != 0) goto L_0x007c
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x007c:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0085
            r3.addAll(r1)
        L_0x0085:
            int r6 = r6 + 1
            goto L_0x0046
        L_0x0088:
            X.Cke r1 = X.C25995CqB.A01()
            int r0 = r2.A05
            int[] r7 = r1.A00(r0)
            r6 = 0
            r11 = 0
        L_0x0094:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x00f9
            r0 = r7[r6]
            java.util.List r8 = r2.A0F(r0)
            r5 = r8
            r4 = 0
        L_0x009f:
            int r0 = r8.size()
            if (r4 >= r0) goto L_0x00e9
            X.DFL r1 = X.AnonymousClass8BR.A0G(r8, r4)
            if (r1 == 0) goto L_0x00e6
            X.E9O r0 = r2.A01
            X.DFL r9 = A00(r0, r14, r1)
            if (r9 == r1) goto L_0x00bc
            if (r5 != r8) goto L_0x00b9
            java.util.ArrayList r5 = X.C17880vN.A10(r8)
        L_0x00b9:
            r5.set(r4, r9)
        L_0x00bc:
            int r10 = r9.A00
            r1 = 1
            r0 = r10 & 1
            if (r0 != 0) goto L_0x00c4
            r1 = 0
        L_0x00c4:
            r13 = r13 | r1
            r0 = r10 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r12 = r12 | r0
            int r1 = r9.A05
            r0 = 16851(0x41d3, float:2.3613E-41)
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            r11 = r11 | r0
            java.util.Set r1 = r9.A03
            if (r1 != 0) goto L_0x00dd
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x00dd:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00e6
            r3.addAll(r1)
        L_0x00e6:
            int r4 = r4 + 1
            goto L_0x009f
        L_0x00e9:
            if (r5 == r8) goto L_0x00f6
            if (r2 != r15) goto L_0x00f1
            X.DFL r2 = r15.A08()
        L_0x00f1:
            r0 = r7[r6]
            r2.A0H(r0, r5)
        L_0x00f6:
            int r6 = r6 + 1
            goto L_0x0094
        L_0x00f9:
            if (r2 == r15) goto L_0x011a
            int r0 = r2.A00
            if (r13 == 0) goto L_0x0124
            r0 = r0 | 1
        L_0x0101:
            r2.A00 = r0
            if (r12 == 0) goto L_0x0121
            r0 = r0 | 2
        L_0x0107:
            r2.A00 = r0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0110
            r3 = 0
        L_0x0110:
            r2.A03 = r3
            int r0 = r2.A00
            if (r11 == 0) goto L_0x011e
            r0 = r0 | 4
        L_0x0118:
            r2.A00 = r0
        L_0x011a:
            r14.C9d(r2)
            return r2
        L_0x011e:
            r0 = r0 & -5
            goto L_0x0118
        L_0x0121:
            r0 = r0 & -3
            goto L_0x0107
        L_0x0124:
            r0 = r0 & -2
            goto L_0x0101
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DWZ.A00(X.E9O, X.E87, X.DFL):X.DFL");
    }
}
