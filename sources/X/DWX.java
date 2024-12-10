package X;

public class DWX implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public DWX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C18110vm A00(Object obj, int i) {
        return AnonymousClass1DF.A01(new DWX(obj, i));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x015e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x016e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x017e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x018e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x019f */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016a A[Catch:{ JSONException -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017a A[Catch:{ JSONException -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018a A[Catch:{ JSONException -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019b A[Catch:{ JSONException -> 0x019f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x001e;
                case 2: goto L_0x002a;
                case 3: goto L_0x0036;
                case 4: goto L_0x0042;
                case 5: goto L_0x0005;
                case 6: goto L_0x004e;
                case 7: goto L_0x0065;
                case 8: goto L_0x0076;
                case 9: goto L_0x00a1;
                case 10: goto L_0x00ab;
                case 11: goto L_0x00b8;
                case 12: goto L_0x00c9;
                case 13: goto L_0x00b8;
                case 14: goto L_0x00da;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x020a;
                case 18: goto L_0x0218;
                case 19: goto L_0x0246;
                case 20: goto L_0x025d;
                case 21: goto L_0x026e;
                case 22: goto L_0x02e2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x000f:
            java.lang.Object r0 = r8.A01
            X.BLP r0 = (X.BLP) r0
            X.D3k r0 = r0.A2m()
            X.ECW r0 = r0.A04
            X.3Ki r3 = r0.BGC()
            return r3
        L_0x001e:
            java.lang.Object r0 = r8.A01
            X.E4z r0 = (X.C28515E4z) r0
            X.E52 r0 = (X.E52) r0
            X.DG8 r3 = new X.DG8
            r3.<init>(r0)
            return r3
        L_0x002a:
            java.lang.Object r0 = r8.A01
            X.E4z r0 = (X.C28515E4z) r0
            X.E52 r0 = (X.E52) r0
            X.DG5 r3 = new X.DG5
            r3.<init>(r0)
            return r3
        L_0x0036:
            java.lang.Object r0 = r8.A01
            X.E4z r0 = (X.C28515E4z) r0
            X.E52 r0 = (X.E52) r0
            X.DG6 r3 = new X.DG6
            r3.<init>(r0)
            return r3
        L_0x0042:
            java.lang.Object r0 = r8.A01
            X.E4z r0 = (X.C28515E4z) r0
            X.E52 r0 = (X.E52) r0
            X.DG7 r3 = new X.DG7
            r3.<init>(r0)
            return r3
        L_0x004e:
            java.lang.Object r1 = r8.A01
            X.DOs r1 = (X.C26996DOs) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.facebook.wearable.mediastream.model.SUPToggleState r1 = r1.A01
            boolean r0 = r1 instanceof X.C22959BXf
            if (r0 == 0) goto L_0x0063
            X.BXf r1 = (X.C22959BXf) r1
            X.BTh r0 = r1.A00
            X.CNl r3 = r0.A00
            return r3
        L_0x0063:
            r3 = 0
            return r3
        L_0x0065:
            java.lang.Object r1 = r8.A01
            X.DOs r1 = (X.C26996DOs) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.Be0()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0076:
            java.lang.Object r4 = r8.A01
            X.DOs r4 = (X.C26996DOs) r4
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            r0 = 1
            r4.CPZ(r0)
            com.facebook.wearable.mediastream.model.SUPToggleState r1 = r4.A01
            boolean r0 = r1 instanceof X.C22959BXf
            if (r0 == 0) goto L_0x02f4
            X.BXf r1 = (X.C22959BXf) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x02f4
            X.BTh r2 = r1.A00
            X.CNl r0 = r2.A00
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x02f4
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x02f4
            X.C26996DOs.A05(r4, r3)
            goto L_0x02f4
        L_0x00a1:
            java.lang.Object r0 = r8.A01
            X.DOr r0 = (X.C26995DOr) r0
            X.C26995DOr.A03(r0)
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x00ab:
            java.lang.Object r1 = r8.A01
            X.DOr r1 = (X.C26995DOr) r1
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x00b8:
            java.lang.Object r2 = r8.A01
            X.0vd r2 = (X.C18020vd) r2
            r1 = 6604(0x19cc, float:9.254E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            java.lang.Boolean r3 = X.C108945cZ.A1A(r0)
            return r3
        L_0x00c9:
            java.lang.Object r2 = r8.A01
            X.0vd r2 = (X.C18020vd) r2
            r1 = 6603(0x19cb, float:9.253E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            java.lang.Boolean r3 = X.C108945cZ.A1A(r0)
            return r3
        L_0x00da:
            java.lang.Object r3 = r8.A01
            X.0vd r3 = (X.C18020vd) r3
            r4 = 0
            java.lang.Boolean r0 = X.C17960vV.A01
            X.CUa r2 = new X.CUa
            r2.<init>()
            r0 = 1
            r2.A0f = r0
            java.lang.String r0 = "whatsapp"
            r2.A0V = r0
            r6 = 1
            r2.A0i = r6
            r0 = 60000(0xea60, double:2.9644E-319)
            r2.A0G = r0
            r2.A0g = r6
            r2.A0D = r6
            r0 = 12000(0x2ee0, float:1.6816E-41)
            r2.A03 = r0
            r0 = 60000(0xea60, float:8.4078E-41)
            r2.A04 = r0
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = "WA_Player_SubOrigin"
            r1[r4] = r0
            java.util.HashSet r0 = X.AnonymousClass1AP.A01(r1)
            r2.A0Y = r0
            r2.A0k = r6
            X.CKt r0 = new X.CKt
            r0.<init>()
            r0.A00 = r6
            X.DRe r0 = new X.DRe
            r0.<init>(r6)
            r2.A0N = r0
            r0 = 5590(0x15d6, float:7.833E-42)
            X.0vf r1 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r2.A0C = r0
            r0 = 5812(0x16b4, float:8.144E-42)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r2.A0B = r0
            r0 = 5439(0x153f, float:7.622E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r2.A0o = r0
            r0 = 5897(0x1709, float:8.263E-42)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r2.A08 = r0
            r0 = 5898(0x170a, float:8.265E-42)
            java.lang.String r4 = r3.A0I(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x01a1 }
            if (r0 != 0) goto L_0x01a1
            org.json.JSONObject r7 = X.C17880vN.A16(r4)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = "minBufferMs"
            r4 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r7.has(r5)     // Catch:{ JSONException -> 0x015e }
            if (r0 == 0) goto L_0x015e
            int r4 = r7.getInt(r5)     // Catch:{ JSONException -> 0x015e }
        L_0x015e:
            r2.A06 = r4     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = "maxBufferMs"
            r4 = 2000(0x7d0, float:2.803E-42)
            boolean r0 = r7.has(r5)     // Catch:{ JSONException -> 0x016e }
            if (r0 == 0) goto L_0x016e
            int r4 = r7.getInt(r5)     // Catch:{ JSONException -> 0x016e }
        L_0x016e:
            r2.A05 = r4     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = "bufferForPlaybackMs"
            r4 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r7.has(r5)     // Catch:{ JSONException -> 0x017e }
            if (r0 == 0) goto L_0x017e
            int r4 = r7.getInt(r5)     // Catch:{ JSONException -> 0x017e }
        L_0x017e:
            r2.A00 = r4     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = "rebufferMs"
            r4 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r7.has(r5)     // Catch:{ JSONException -> 0x018e }
            if (r0 == 0) goto L_0x018e
            int r4 = r7.getInt(r5)     // Catch:{ JSONException -> 0x018e }
        L_0x018e:
            r2.A02 = r4     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = "individualAllocation"
            r4 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = r7.has(r5)     // Catch:{ JSONException -> 0x019f }
            if (r0 == 0) goto L_0x019f
            int r4 = r7.getInt(r5)     // Catch:{ JSONException -> 0x019f }
        L_0x019f:
            r2.A01 = r4     // Catch:{ JSONException -> 0x01a1 }
        L_0x01a1:
            r0 = 5991(0x1767, float:8.395E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r0 = r0 ^ 1
            r2.A0n = r0
            r0 = 6015(0x177f, float:8.429E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r6 = r6 ^ r0
            r2.A0j = r6
            r0 = 5440(0x1540, float:7.623E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r2.A0l = r0
            r0 = 6180(0x1824, float:8.66E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r2.A0h = r0
            r0 = 6343(0x18c7, float:8.888E-42)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r2.A07 = r0
            r0 = 6392(0x18f8, float:8.957E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r2.A0m = r0
            r0 = 6401(0x1901, float:8.97E-42)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r2.A0A = r0
            r0 = 6357(0x18d5, float:8.908E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r2.A0e = r0
            r0 = 6549(0x1995, float:9.177E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r2.A0p = r0
            r0 = 6596(0x19c4, float:9.243E-42)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r2.A09 = r0
            r0 = 6597(0x19c5, float:9.244E-42)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r2.A0E = r0
            r0 = 7316(0x1c94, float:1.0252E-41)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r2.A0F = r0
            X.DRp r3 = new X.DRp
            r3.<init>(r2)
            return r3
        L_0x020a:
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1D()
            r0.onBackPressed()
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x0218:
            java.lang.Object r1 = r8.A01
            com.whatsapp.profile.viewmodel.UsernameSetSuccessDialogViewModel r1 = (com.whatsapp.profile.viewmodel.UsernameSetSuccessDialogViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1Vc r2 = r1.A01
            X.118 r0 = r1.A02
            android.content.Context r3 = r0.A00
            X.11S r0 = r1.A00
            r0.A0I()
            X.1E8 r4 = r0.A0D
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.data.WAContact"
            X.C18070vi.A0z(r4, r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168294(0x7f070c26, float:1.7950886E38)
            int r7 = r1.getDimensionPixelSize(r0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r5 = "UsernameSetSuccessDialogViewModel"
            android.graphics.Bitmap r3 = r2.BX4(r3, r4, r5, r6, r7)
            return r3
        L_0x0246:
            java.lang.Object r1 = r8.A01
            X.COc r1 = (X.C24884COc) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A00
            java.lang.Object r1 = r0.get()
            X.0vc r1 = (X.C18010vc) r1
            java.lang.String r0 = "pref_quick_action_bar_display_state"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x025d:
            java.lang.Object r1 = r8.A01
            X.CQh r1 = (X.C24934CQh) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A01
            java.lang.String r0 = "reaction_prefs"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x026e:
            java.lang.Object r4 = r8.A01
            X.CTO r4 = (X.CTO) r4
            r1 = 0
            X.C18070vi.A0d(r4, r1)
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            java.util.LinkedHashMap r2 = X.C17880vN.A13()
            X.00H r0 = r4.A03
            r0.get()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get()
            r2.put(r1, r0)
            X.00H r0 = r4.A05
            r0.get()
            java.lang.Integer r1 = X.C17880vN.A0h()
            java.lang.Object r0 = r0.get()
            r2.put(r1, r0)
            X.00H r0 = r4.A04
            r0.get()
            java.lang.Integer r1 = X.C17880vN.A0i()
            java.lang.Object r0 = r0.get()
            r2.put(r1, r0)
            X.00H r0 = r4.A00
            r0.get()
            java.lang.Integer r1 = X.C17880vN.A0j()
            java.lang.Object r0 = r0.get()
            r2.put(r1, r0)
            X.00H r0 = r4.A01
            r0.get()
            java.lang.Integer r1 = X.C17880vN.A0k()
            java.lang.Object r0 = r0.get()
            r2.put(r1, r0)
            X.00H r0 = r4.A02
            r0.get()
            java.lang.Integer r1 = X.C17880vN.A0l()
            java.lang.Object r0 = r0.get()
            r2.put(r1, r0)
            r3.putAll(r2)
            return r3
        L_0x02e2:
            java.lang.Object r1 = r8.A01
            X.BwF r1 = (X.C24149BwF) r1
            X.C24149BwF.A04(r1)
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x02f4
            android.view.ViewGroup r1 = r1.A0b
            r0 = 8
            r1.setVisibility(r0)
        L_0x02f4:
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DWX.invoke():java.lang.Object");
    }
}
