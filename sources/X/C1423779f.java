package X;

/* renamed from: X.79f  reason: invalid class name and case insensitive filesystem */
public class C1423779f implements AnonymousClass02j, C22841Dk {
    public final int A00;
    public final Object A01;

    public C1423779f(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C18080vj BS6() {
        Class cls;
        String str;
        int i;
        int i2;
        String str2;
        int i3 = this.A00;
        Object obj = this.A01;
        switch (i3) {
            case 0:
                cls = C134086pz.class;
                str = "onAudienceSelectorResult(Landroidx/activity/result/ActivityResult;)V";
                i = 0;
                i2 = 1;
                str2 = "onAudienceSelectorResult";
                break;
            case 1:
                cls = C138676xV.class;
                str = "handleDocumentPickerActivityResult(Landroidx/activity/result/ActivityResult;)V";
                i = 0;
                i2 = 1;
                str2 = "handleDocumentPickerActivityResult";
                break;
            default:
                cls = C138676xV.class;
                str = "handleGalleryPickerActivityResult(Landroidx/activity/result/ActivityResult;)V";
                i = 0;
                i2 = 1;
                str2 = "handleGalleryPickerActivityResult";
                break;
        }
        return new AnonymousClass1JJ(i2, obj, cls, str2, str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (X.C138676xV.A00(r4, r1) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bkx(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            X.02m r10 = (X.C005702m) r10
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0065;
                default: goto L_0x0007;
            }
        L_0x0007:
            r5 = 0
            X.C18070vi.A0d(r10, r5)
            java.lang.Object r4 = r9.A01
            X.6xV r4 = (X.C138676xV) r4
            android.webkit.ValueCallback r0 = r4.A00
            r3 = 0
            if (r0 == 0) goto L_0x0050
            android.content.Intent r2 = r10.A01
            int r1 = r10.A00
            r0 = -1
            if (r1 != r0) goto L_0x003a
            if (r2 == 0) goto L_0x003a
            java.lang.String r1 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r2.getParcelableArrayListExtra(r1)
            if (r0 == 0) goto L_0x0053
            java.util.ArrayList r1 = r2.getParcelableArrayListExtra(r1)
            X.C18070vi.A0b(r1)
            android.net.Uri[] r0 = new android.net.Uri[r5]
            java.lang.Object[] r1 = r1.toArray(r0)
            android.net.Uri[] r1 = (android.net.Uri[]) r1
        L_0x0034:
            boolean r0 = X.C138676xV.A00(r4, r1)
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            r1 = r3
        L_0x003b:
            android.webkit.ValueCallback r2 = r4.A00
            if (r2 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x0043
            android.net.Uri[] r1 = new android.net.Uri[r5]
        L_0x0043:
            java.util.List r1 = X.C200410p.A0P(r1)
            android.net.Uri[] r0 = new android.net.Uri[r5]
            java.lang.Object[] r0 = r1.toArray(r0)
            r2.onReceiveValue(r0)
        L_0x0050:
            r4.A00 = r3
        L_0x0052:
            return
        L_0x0053:
            android.net.Uri r0 = r2.getData()
            if (r0 == 0) goto L_0x0063
            r0 = 1
            android.net.Uri[] r1 = new android.net.Uri[r0]
            android.net.Uri r0 = r2.getData()
            r1[r5] = r0
            goto L_0x0034
        L_0x0063:
            r1 = r3
            goto L_0x0034
        L_0x0065:
            r4 = 0
            X.C18070vi.A0d(r10, r4)
            java.lang.Object r2 = r9.A01
            X.6xV r2 = (X.C138676xV) r2
            android.webkit.ValueCallback r0 = r2.A00
            if (r0 == 0) goto L_0x0052
            android.content.Intent r8 = r10.A01
            int r1 = r10.A00
            r0 = -1
            r3 = 0
            if (r1 != r0) goto L_0x0110
            if (r8 == 0) goto L_0x0110
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            android.content.ClipData r6 = r8.getClipData()
            if (r6 == 0) goto L_0x00ee
            int r5 = r6.getItemCount()
            r1 = 0
        L_0x008a:
            if (r1 >= r5) goto L_0x00ee
            android.content.ClipData$Item r0 = r6.getItemAt(r1)
            if (r0 == 0) goto L_0x009b
            android.net.Uri r0 = r0.getUri()
            if (r0 == 0) goto L_0x009b
            r7.add(r0)
        L_0x009b:
            int r1 = r1 + 1
            goto L_0x008a
        L_0x009e:
            r4 = 0
            X.C18070vi.A0d(r10, r4)
            java.lang.Object r3 = r9.A01
            X.6pz r3 = (X.C134086pz) r3
            int r1 = r10.A00
            r0 = -1
            if (r1 != r0) goto L_0x00c9
            android.content.Intent r0 = r10.A01
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            X.5iV r2 = r3.A04
            X.6uR r1 = r3.A03
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x00e9
            X.77K r1 = r1.A00(r0)
            X.1DT r0 = r2.A00
            r0.A0F(r1)
        L_0x00c6:
            r3.A00 = r4
            return
        L_0x00c9:
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x00c6
            X.5iV r2 = r3.A04
            X.77K r0 = r2.A0T()
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x00c6
            X.77K r0 = r2.A0T()
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c6
            r0 = 2
            r2.A0U(r0)
            goto L_0x00c6
        L_0x00e9:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x00ee:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00fd
            android.net.Uri r0 = r8.getData()
            if (r0 == 0) goto L_0x00fd
            r7.add(r0)
        L_0x00fd:
            boolean r0 = X.C17880vN.A1X(r7)
            if (r0 == 0) goto L_0x0110
            int r1 = r7.size()
            int r0 = r2.A01
            if (r1 <= r0) goto L_0x011a
            java.lang.String r0 = "WaInAppBrowsingActivity/handleDocumentPickerActivityResult too many files"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0110:
            android.webkit.ValueCallback r0 = r2.A00
            if (r0 == 0) goto L_0x0117
            r0.onReceiveValue(r3)
        L_0x0117:
            r2.A00 = r3
            return
        L_0x011a:
            android.net.Uri[] r0 = new android.net.Uri[r4]
            java.lang.Object[] r1 = r7.toArray(r0)
            android.net.Uri[] r1 = (android.net.Uri[]) r1
            boolean r0 = X.C138676xV.A00(r2, r1)
            if (r0 != 0) goto L_0x012a
            android.net.Uri[] r1 = new android.net.Uri[r4]
        L_0x012a:
            android.webkit.ValueCallback r0 = r2.A00
            if (r0 == 0) goto L_0x0131
            r0.onReceiveValue(r1)
        L_0x0131:
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423779f.Bkx(java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass02j) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C108975cc.A1L(obj, BS6());
    }

    public final int hashCode() {
        return BS6().hashCode();
    }
}
