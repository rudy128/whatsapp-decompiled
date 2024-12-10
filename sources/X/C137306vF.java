package X;

/* renamed from: X.6vF  reason: invalid class name and case insensitive filesystem */
public final class C137306vF {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.69h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.69h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.69h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.69h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: X.69h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: X.69h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C123436Ul A00(java.util.List r15, org.json.JSONObject r16) {
        /*
            java.lang.String r0 = "type"
            r3 = r16
            java.lang.String r1 = X.C18070vi.A0J(r0, r3)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1556336053: goto L_0x0049;
                case 49116392: goto L_0x003b;
                case 1021915016: goto L_0x002d;
                case 1953129077: goto L_0x001f;
                case 1971936087: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            r2 = 0
            return r2
        L_0x0011:
            java.lang.String r0 = "undo_modify_shape"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.69k r2 = new X.69k
            r2.<init>()
            goto L_0x0056
        L_0x001f:
            java.lang.String r0 = "undo_change_z_order"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.69i r2 = new X.69i
            r2.<init>()
            goto L_0x0056
        L_0x002d:
            java.lang.String r0 = "undo_delete_shape"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.69j r2 = new X.69j
            r2.<init>()
            goto L_0x0056
        L_0x003b:
            java.lang.String r0 = "undo_add_shape"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.69g r2 = new X.69g
            r2.<init>()
            goto L_0x0056
        L_0x0049:
            java.lang.String r0 = "undo_bulk_actions"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.69h r2 = new X.69h
            r2.<init>()
        L_0x0056:
            boolean r0 = r2 instanceof X.C1196769k
            r5 = r15
            if (r0 == 0) goto L_0x00ea
            r4 = r2
            X.69k r4 = (X.C1196769k) r4
            android.graphics.RectF r7 = X.AnonymousClass3MW.A08()
            java.lang.String r0 = "left"
            double r0 = r3.getDouble(r0)
            float r6 = (float) r0
            r7.left = r6
            java.lang.String r0 = "right"
            double r0 = r3.getDouble(r0)
            float r6 = (float) r0
            r7.right = r6
            java.lang.String r0 = "top"
            double r0 = r3.getDouble(r0)
            float r6 = (float) r0
            r7.top = r6
            java.lang.String r0 = "bottom"
            double r0 = r3.getDouble(r0)
            float r6 = (float) r0
            r7.bottom = r6
            java.lang.String r0 = "color"
            int r13 = r3.getInt(r0)
            java.lang.String r0 = "rotate"
            double r0 = r3.getDouble(r0)
            float r9 = (float) r0
            java.lang.String r0 = "strokeWidth"
            double r0 = r3.getDouble(r0)
            float r10 = (float) r0
            java.lang.String r1 = "text"
            boolean r0 = r3.has(r1)
            if (r0 == 0) goto L_0x00e4
            java.lang.String r8 = X.C18070vi.A0J(r1, r3)
            java.lang.String r0 = "text-size"
            double r0 = r3.getDouble(r0)
            float r11 = (float) r0
            java.lang.String r0 = "scale-factor"
            double r0 = r3.getDouble(r0)
            float r12 = (float) r0
            java.lang.String r0 = "fontStyle"
            int r14 = r3.getInt(r0)
            java.lang.String r0 = "alignment"
            int r15 = r3.getInt(r0)
            java.lang.String r0 = "background_style"
            int r16 = r3.getInt(r0)
            X.69P r6 = new X.69P
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00cb:
            r4.A00 = r6
        L_0x00cd:
            java.lang.String r0 = "shape_index"
            int r1 = r3.getInt(r0)
            if (r1 < 0) goto L_0x000f
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x000f
            java.lang.Object r0 = r5.get(r1)
            X.73u r0 = (X.C1409773u) r0
            r2.A00 = r0
            return r2
        L_0x00e4:
            X.6hH r6 = new X.6hH
            r6.<init>(r7, r9, r10, r13)
            goto L_0x00cb
        L_0x00ea:
            boolean r0 = r2 instanceof X.AnonymousClass69j
            if (r0 == 0) goto L_0x00fa
            r1 = r2
            X.69j r1 = (X.AnonymousClass69j) r1
            java.lang.String r0 = "index"
            int r0 = r3.getInt(r0)
            r1.A00 = r0
            goto L_0x00cd
        L_0x00fa:
            boolean r0 = r2 instanceof X.C1196569h
            if (r0 == 0) goto L_0x00cd
            r1 = r2
            X.69h r1 = (X.C1196569h) r1
            java.lang.String r0 = "actions"
            org.json.JSONArray r7 = r3.getJSONArray(r0)
            java.util.List r6 = r1.A00
            r6.clear()
            int r4 = r7.length()
            r1 = 0
        L_0x0111:
            if (r1 >= r4) goto L_0x00cd
            org.json.JSONObject r0 = r7.getJSONObject(r1)
            X.C18070vi.A0b(r0)
            X.6Ul r0 = A00(r15, r0)
            if (r0 == 0) goto L_0x0123
            r6.add(r0)
        L_0x0123:
            int r1 = r1 + 1
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137306vF.A00(java.util.List, org.json.JSONObject):X.6Ul");
    }
}
