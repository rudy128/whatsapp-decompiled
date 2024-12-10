package X;

/* renamed from: X.BSr  reason: case insensitive filesystem */
public class C22863BSr extends C22814BQp {
    public final /* synthetic */ DDG A00;
    public final /* synthetic */ ECs A01;
    public final /* synthetic */ C28605E9w A02;
    public final /* synthetic */ C25256Cbv A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22863BSr(C25268CcD ccD, DDG ddg, ECs eCs, ECs eCs2, C28605E9w e9w, C28605E9w e9w2, C25256Cbv cbv, String str) {
        super(ccD, eCs, e9w, str);
        this.A00 = ddg;
        this.A03 = cbv;
        this.A02 = e9w2;
        this.A01 = eCs2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.BSj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.BSj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.BSl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.BSj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.BSj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.BSj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.BSj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.BSj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A00() {
        /*
            r8 = this;
            X.DDG r4 = r8.A00
            X.Cbv r1 = r8.A03
            boolean r0 = r4 instanceof X.C22858BSm
            if (r0 == 0) goto L_0x0035
            r3 = r4
            X.BSm r3 = (X.C22858BSm) r3
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.ContentResolver r2 = r3.A00
            android.net.Uri r0 = r1.A03
            java.io.InputStream r1 = r2.openInputStream(r0)
            if (r1 == 0) goto L_0x0268
            r0 = -1
            X.DRJ r7 = r3.A00(r1, r0)
        L_0x001e:
            java.lang.String r6 = "fetch"
            java.lang.String r5 = "local"
            if (r7 != 0) goto L_0x024c
            X.E9w r3 = r8.A02
            X.ECs r2 = r8.A01
            java.lang.String r1 = r4.A01()
            r0 = 0
            r3.C9Q(r2, r1, r0)
            r2.CD4(r5, r6)
            r7 = 0
            return r7
        L_0x0035:
            boolean r0 = r4 instanceof X.C22857BSl
            if (r0 == 0) goto L_0x007d
            r5 = r4
            X.BSl r5 = (X.C22857BSl) r5
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.res.Resources r3 = r5.A00
            android.net.Uri r2 = r1.A03
            java.lang.String r1 = r2.getPath()
            if (r1 == 0) goto L_0x026f
            r0 = 1
            java.lang.String r0 = r1.substring(r0)
            X.C18070vi.A0X(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.InputStream r6 = r3.openRawResource(r0)
            r7 = 0
            java.lang.String r1 = r2.getPath()     // Catch:{ NotFoundException -> 0x01e3, all -> 0x028b }
            if (r1 == 0) goto L_0x0078
            r0 = 1
            java.lang.String r0 = r1.substring(r0)     // Catch:{ NotFoundException -> 0x01e3, all -> 0x028b }
            X.C18070vi.A0X(r0)     // Catch:{ NotFoundException -> 0x01e3, all -> 0x028b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NotFoundException -> 0x01e3, all -> 0x028b }
            android.content.res.AssetFileDescriptor r7 = r3.openRawResourceFd(r0)     // Catch:{ NotFoundException -> 0x01e3, all -> 0x028b }
            long r0 = r7.getLength()     // Catch:{ NotFoundException -> 0x01e3, all -> 0x028b }
            int r2 = (int) r0     // Catch:{ NotFoundException -> 0x01e3, all -> 0x028b }
            goto L_0x01df
        L_0x0078:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ NotFoundException -> 0x01e3, all -> 0x028b }
            throw r0     // Catch:{ NotFoundException -> 0x01e3, all -> 0x028b }
        L_0x007d:
            boolean r0 = r4 instanceof X.C22856BSi
            if (r0 == 0) goto L_0x00a1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.io.File r0 = r1.A00()
            java.lang.String r0 = r0.toString()
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r0)
            java.io.File r0 = r1.A00()
            long r1 = r0.length()
            int r0 = (int) r1
            X.DRJ r7 = r4.A00(r3, r0)
            goto L_0x001e
        L_0x00a1:
            boolean r0 = r4 instanceof X.C22859BSn
            if (r0 == 0) goto L_0x00c1
            android.net.Uri r1 = r1.A03
            android.net.Uri r0 = X.C20012A3c.A00
            java.lang.String r1 = r1.toString()
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00be
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            r0.toString()
        L_0x00be:
            r7 = 0
            goto L_0x001e
        L_0x00c1:
            boolean r0 = r4 instanceof X.BSk
            if (r0 == 0) goto L_0x01a3
            r5 = r4
            X.BSk r5 = (X.BSk) r5
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.net.Uri r2 = r1.A03
            X.C18070vi.A0X(r2)
            android.net.Uri r0 = X.C20012A3c.A00
            java.lang.String r0 = r2.getPath()
            r3 = 0
            if (r0 == 0) goto L_0x0103
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0103
            java.lang.String r1 = "com.android.contacts"
            java.lang.String r0 = r2.getAuthority()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0103
            java.lang.String r1 = r2.getPath()
            android.net.Uri r0 = X.C20012A3c.A00
            java.lang.String r0 = r0.getPath()
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0103
            r3 = 1
        L_0x0103:
            java.lang.String r7 = "Required value was null."
            if (r3 == 0) goto L_0x0152
            java.lang.String r1 = X.C18070vi.A0H(r2)
            java.lang.String r0 = "/photo"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0120
            android.content.ContentResolver r0 = r5.A00
            java.io.InputStream r1 = r0.openInputStream(r2)
        L_0x0119:
            if (r1 != 0) goto L_0x019c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)
            throw r0
        L_0x0120:
            java.lang.String r1 = X.C18070vi.A0H(r2)
            java.lang.String r0 = "/display_photo"
            boolean r0 = r1.endsWith(r0)
            java.lang.String r3 = "Contact photo does not exist: "
            if (r0 == 0) goto L_0x013d
            android.content.ContentResolver r1 = r5.A00     // Catch:{ IOException -> 0x0279 }
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r0 = r1.openAssetFileDescriptor(r2, r0)     // Catch:{ IOException -> 0x0279 }
            if (r0 == 0) goto L_0x0274
            java.io.FileInputStream r1 = r0.createInputStream()     // Catch:{ IOException -> 0x0279 }
            goto L_0x0119
        L_0x013d:
            android.content.ContentResolver r0 = r5.A00
            java.io.InputStream r1 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r2)
            if (r1 != 0) goto L_0x019c
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r3, r0)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0152:
            java.lang.String r1 = r2.toString()
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x016e
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x018f
        L_0x016e:
            android.content.ContentResolver r1 = r5.A00     // Catch:{ FileNotFoundException -> 0x018f }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r6 = r1.openFileDescriptor(r2, r0)     // Catch:{ FileNotFoundException -> 0x018f }
            if (r6 == 0) goto L_0x0286
            java.io.FileDescriptor r0 = r6.getFileDescriptor()
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r0)
            long r1 = r6.getStatSize()
            int r0 = (int) r1
            X.DRJ r7 = r5.A00(r3, r0)
            r6.close()
            goto L_0x001e
        L_0x018f:
            android.content.ContentResolver r0 = r5.A00
            java.io.InputStream r1 = r0.openInputStream(r2)
            if (r1 != 0) goto L_0x019c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)
            throw r0
        L_0x019c:
            r0 = -1
            X.DRJ r7 = r5.A00(r1, r0)
            goto L_0x001e
        L_0x01a3:
            boolean r0 = r4 instanceof X.BSj
            if (r0 == 0) goto L_0x01ef
            r5 = r4
            X.BSj r5 = (X.BSj) r5
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.res.AssetManager r3 = r5.A00
            android.net.Uri r2 = r1.A03
            java.lang.String r1 = r2.getPath()
            X.C18070vi.A0b(r1)
            r0 = 1
            java.lang.String r1 = r1.substring(r0)
            X.C18070vi.A0X(r1)
            r0 = 2
            java.io.InputStream r6 = r3.open(r1, r0)
            r7 = 0
            java.lang.String r1 = r2.getPath()     // Catch:{  }
            X.C18070vi.A0b(r1)     // Catch:{  }
            r0 = 1
            java.lang.String r0 = r1.substring(r0)     // Catch:{  }
            X.C18070vi.A0X(r0)     // Catch:{  }
            android.content.res.AssetFileDescriptor r7 = r3.openFd(r0)     // Catch:{  }
            long r0 = r7.getLength()     // Catch:{  }
            int r2 = (int) r0     // Catch:{  }
        L_0x01df:
            r7.close()     // Catch:{ IOException -> 0x01e9 }
            goto L_0x01e9
        L_0x01e3:
            if (r7 == 0) goto L_0x01e8
            r7.close()     // Catch:{ IOException -> 0x01e8 }
        L_0x01e8:
            r2 = -1
        L_0x01e9:
            X.DRJ r7 = r5.A00(r6, r2)
            goto L_0x001e
        L_0x01ef:
            android.net.Uri r0 = r1.A03
            java.lang.String r6 = r0.toString()
            r0 = 5
            r5 = 0
            java.lang.String r1 = r6.substring(r5, r0)
            java.lang.String r0 = "data:"
            boolean r0 = r1.equals(r0)
            X.C26208Cuj.A04(r0)
            r0 = 44
            int r2 = r6.indexOf(r0)
            int r1 = r2 + 1
            int r0 = r6.length()
            java.lang.String r3 = r6.substring(r1, r0)
            java.lang.String r2 = r6.substring(r5, r2)
            java.lang.String r1 = ";"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0240
            java.lang.String[] r1 = r2.split(r1)
            int r0 = r1.length
            int r0 = r0 + -1
            r1 = r1[r0]
            java.lang.String r0 = "base64"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0240
            byte[] r0 = android.util.Base64.decode(r3, r5)
        L_0x0235:
            java.io.ByteArrayInputStream r1 = X.BE6.A0h(r0)
            int r0 = r0.length
            X.DRJ r7 = r4.A00(r1, r0)
            goto L_0x001e
        L_0x0240:
            java.lang.String r0 = android.net.Uri.decode(r3)
            X.C26208Cuj.A01(r0)
            byte[] r0 = r0.getBytes()
            goto L_0x0235
        L_0x024c:
            X.DRJ.A02(r7)
            X.E9w r3 = r8.A02
            X.ECs r2 = r8.A01
            java.lang.String r1 = r4.A01()
            r0 = 1
            r3.C9Q(r2, r1, r0)
            r2.CD4(r5, r6)
            java.lang.String r1 = "image_color_space"
            android.graphics.ColorSpace r0 = r7.A06()
            r2.CD2(r1, r0)
            return r7
        L_0x0268:
            java.lang.String r0 = "ContentResolver returned null InputStream"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x026f:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0274:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)     // Catch:{ IOException -> 0x0279 }
            throw r0     // Catch:{ IOException -> 0x0279 }
        L_0x0279:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r3, r0)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0286:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)
            throw r0
        L_0x028b:
            r0 = move-exception
            if (r7 == 0) goto L_0x0291
            r7.close()     // Catch:{ IOException -> 0x0291 }
        L_0x0291:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22863BSr.A00():java.lang.Object");
    }
}
