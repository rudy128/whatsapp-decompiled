package X;

public final class CjD {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        X.C25913CoX.A00((X.DOZ) null, "BloksDataStorage", "Casting error when retrieving data", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.os.Bundle r4, java.lang.Class r5, java.lang.String r6) {
        /*
            r0 = -1
            int r4 = r4.getInt(r6, r0)
            if (r4 != r0) goto L_0x0009
            r3 = 0
        L_0x0008:
            return r3
        L_0x0009:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0008
            java.lang.Object r2 = X.C25925Coo.A01     // Catch:{ ClassCastException -> 0x002d }
            monitor-enter(r2)     // Catch:{ ClassCastException -> 0x002d }
            android.util.SparseArray r1 = X.C25925Coo.A00     // Catch:{ all -> 0x002a }
            int r0 = r1.indexOfKey(r4)     // Catch:{ all -> 0x002a }
            if (r0 >= 0) goto L_0x001d
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x002d }
            return r3
        L_0x001d:
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x002a }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ all -> 0x002a }
            r1.delete(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x002d }
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x002d }
            throw r0     // Catch:{ ClassCastException -> 0x002d }
        L_0x002d:
            r2 = move-exception
            java.lang.String r1 = "BloksDataStorage"
            java.lang.String r0 = "Casting error when retrieving data"
            X.C25913CoX.A00(r3, r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CjD.A00(android.os.Bundle, java.lang.Class, java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.D8F A01(android.os.Bundle r28) {
        /*
            r27 = this;
            r1 = 0
            r0 = r28
            X.C18070vi.A0d(r0, r1)
            java.lang.Class<X.D8F> r2 = X.D8F.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r0.setClassLoader(r2)
            java.lang.String r2 = "container_id"
            int r21 = r0.getInt(r2)
            java.lang.String r2 = "dark_mode_config"
            java.lang.String r3 = r0.getString(r2)
            if (r3 == 0) goto L_0x009c
            java.lang.String r2 = "ForceDarkMode"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0084
            java.lang.Integer r16 = X.AnonymousClass00R.A00
        L_0x0027:
            X.C07 r2 = X.C07.AUTO
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "drag_to_dismiss"
            java.lang.String r2 = r0.getString(r2, r3)
            X.C18070vi.A0X(r2)
            X.C07 r13 = X.CCN.A00(r2)
            X.C0B r2 = X.C0B.FULL_SHEET
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "mode"
            java.lang.String r2 = r0.getString(r2, r3)
            X.C18070vi.A0X(r2)
            X.C0B r14 = X.CCO.A00(r2)
            X.C08 r2 = X.C08.STATIC
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "background_mode"
            java.lang.String r2 = r0.getString(r2, r3)
            X.C18070vi.A0X(r2)
            X.C08 r9 = X.CCL.A00(r2)
            X.C05 r7 = X.C05.SAME_SIZE
            java.lang.String r3 = r7.toString()
            java.lang.String r2 = "corner_style"
            java.lang.String r6 = r0.getString(r2, r3)
            X.C18070vi.A0X(r6)
            X.C05[] r5 = X.C05.A00
            int r4 = r5.length
            r3 = 0
        L_0x0073:
            if (r3 >= r4) goto L_0x009f
            r11 = r5[r3]
            java.lang.String r2 = r11.toString()
            boolean r2 = X.C18070vi.A18(r2, r6)
            if (r2 != 0) goto L_0x00b2
            int r3 = r3 + 1
            goto L_0x0073
        L_0x0084:
            java.lang.String r2 = "ForceLightMode"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x008f
            java.lang.Integer r16 = X.AnonymousClass00R.A01
            goto L_0x0027
        L_0x008f:
            java.lang.String r2 = "Default"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x009c
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r3)
            throw r0
        L_0x009c:
            java.lang.Integer r16 = X.AnonymousClass00R.A0C
            goto L_0x0027
        L_0x009f:
            X.0CT r5 = X.AnonymousClass0CT.ERROR
            java.lang.String r4 = X.D8F.A0T
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Error finding Mode enum value for "
            java.lang.String r3 = X.AnonymousClass001.A1H(r2, r6, r3)
            r2 = 0
            X.AnonymousClass0MD.A00(r5, r4, r3, r2)
            r11 = r7
        L_0x00b2:
            X.C06 r2 = X.C06.AUTO
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "dimmed_background_tap_to_dismiss"
            java.lang.String r2 = r0.getString(r2, r3)
            X.C18070vi.A0X(r2)
            X.C06 r12 = X.CCM.A00(r2)
            java.lang.String r4 = "keyboard_soft_input_mode"
            boolean r2 = r0.containsKey(r4)
            r3 = 0
            if (r2 == 0) goto L_0x0164
            int r2 = r0.getInt(r4)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)
        L_0x00d6:
            java.lang.String r4 = "default"
            java.lang.String r2 = "animation_type"
            java.lang.String r2 = r0.getString(r2, r4)
            java.lang.Integer r18 = X.C25301Cd5.A00(r2)
            X.C18070vi.A0X(r18)
            java.lang.String r2 = "dismiss_animation_type"
            java.lang.String r2 = r0.getString(r2, r4)
            java.lang.Integer r19 = X.C25301Cd5.A00(r2)
            X.C18070vi.A0X(r19)
            java.lang.String r4 = "on_dismiss_callback"
            java.lang.Class<X.D3L> r2 = X.D3L.class
            java.lang.Object r8 = A00(r0, r2, r4)
            X.D3L r8 = (X.D3L) r8
            java.lang.Class<X.6Vl> r4 = X.C123686Vl.class
            java.lang.String r2 = "custom_loading_view_resolver"
            java.lang.Object r15 = A00(r0, r4, r2)
            X.6Vl r15 = (X.C123686Vl) r15
            boolean r23 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "native_disable_cancel_button_on_loading_screen"
            boolean r24 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "clear_top_activity"
            boolean r22 = r0.getBoolean(r2, r1)
            java.lang.String r1 = "dimmed_background_color"
            android.os.Parcelable r4 = r0.getParcelable(r1)
            X.D3N r4 = (X.D3N) r4
            java.lang.String r1 = "background_overlay_color"
            android.os.Parcelable r5 = r0.getParcelable(r1)
            X.D3N r5 = (X.D3N) r5
            java.lang.String r1 = "bottom_sheet_margins"
            android.os.Parcelable r10 = r0.getParcelable(r1)
            X.D3P r10 = (X.D3P) r10
            java.lang.String r1 = "bloks_screen_id"
            java.lang.String r20 = r0.getString(r1, r3)
            java.lang.String r1 = "bottom_sheet_top_span"
            android.os.Parcelable r7 = r0.getParcelable(r1)
            X.D3E r7 = (X.D3E) r7
            java.lang.String r1 = "slide_to_anchor_immediately"
            boolean r25 = r0.getBoolean(r1)
            java.lang.String r1 = "force_gradient_background"
            boolean r26 = r0.getBoolean(r1)
            java.lang.String r1 = "key_dimming_behaviour"
            android.os.Parcelable r6 = r0.getParcelable(r1)
            X.D3D r6 = (X.D3D) r6
            if (r6 != 0) goto L_0x0154
            X.BpJ r6 = X.C23774BpJ.A00
        L_0x0154:
            if (r10 != 0) goto L_0x015e
            boolean r0 = X.CCK.A00()
            if (r0 == 0) goto L_0x015e
            X.C05 r11 = X.C05.TOP_ROUNDED
        L_0x015e:
            X.D8F r3 = new X.D8F
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r3
        L_0x0164:
            r17 = r3
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CjD.A01(android.os.Bundle):X.D8F");
    }
}
