package X;

/* renamed from: X.A5d  reason: case insensitive filesystem */
public abstract class C20055A5d {
    public static int[] A03() {
        return new int[]{100, 101, 102, 103, 104, 105, 106, 107, AnonymousClass74N.A03, 109, 110, 111, 112, 113, 114};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        r2.A04 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        return r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        return new X.AnonymousClass8Qu(r1, r1, r1, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        r2.A00 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass8Qu A00(int r8) {
        /*
            r3 = 104857600(0x6400000, double:5.1806538E-316)
            switch(r8) {
                case 100: goto L_0x0064;
                case 101: goto L_0x0064;
                case 102: goto L_0x0064;
                case 103: goto L_0x0064;
                case 104: goto L_0x0064;
                case 105: goto L_0x0067;
                case 106: goto L_0x0034;
                case 107: goto L_0x0028;
                case 108: goto L_0x0028;
                case 109: goto L_0x0028;
                case 110: goto L_0x003d;
                case 111: goto L_0x0006;
                case 112: goto L_0x001d;
                case 113: goto L_0x0008;
                case 114: goto L_0x004b;
                default: goto L_0x0006;
            }
        L_0x0006:
            r0 = 0
            return r0
        L_0x0008:
            X.9mI r2 = new X.9mI
            r2.<init>()
            r0 = 1048576(0x100000, double:5.180654E-318)
            r2.A00 = r0
            r0 = 524288(0x80000, double:2.590327E-318)
            r2.A01 = r0
            r0 = 209715(0x33333, double:1.03613E-318)
            r2.A02 = r0
            goto L_0x005c
        L_0x001d:
            X.9mI r2 = new X.9mI
            r2.<init>()
            r0 = 12582912(0xc00000, double:6.2167845E-317)
            r2.A00 = r0
            goto L_0x005c
        L_0x0028:
            X.9mI r2 = new X.9mI
            r2.<init>()
            r0 = 1
            r2.A04 = r0
            r3 = 52428800(0x3200000, double:2.5903269E-316)
            goto L_0x0048
        L_0x0034:
            X.9mI r2 = new X.9mI
            r2.<init>()
            r0 = 1
            r2.A04 = r0
            goto L_0x0048
        L_0x003d:
            X.9mI r2 = new X.9mI
            r2.<init>()
            r0 = 1
            r2.A04 = r0
            r3 = 10485760(0xa00000, double:5.180654E-317)
        L_0x0048:
            r2.A00 = r3
            goto L_0x005f
        L_0x004b:
            X.9mI r2 = new X.9mI
            r2.<init>()
            r0 = 209715200(0xc800000, double:1.036130757E-315)
            r2.A00 = r0
            r2.A01 = r3
            r0 = 20971520(0x1400000, double:1.03613076E-316)
            r2.A01 = r0
        L_0x005c:
            r0 = 1
            r2.A04 = r0
        L_0x005f:
            X.8Qu r0 = r2.A00()
            return r0
        L_0x0064:
            r1 = 1024(0x400, double:5.06E-321)
            goto L_0x0069
        L_0x0067:
            r1 = 8
        L_0x0069:
            r7 = 0
            X.8Qu r0 = new X.8Qu
            r5 = r1
            r3 = r1
            r8 = r7
            r0.<init>(r1, r3, r5, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20055A5d.A00(int):X.8Qu");
    }

    public static C22919BVh A01(int i) {
        int i2;
        switch (i) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
                i2 = 0;
                break;
            case 106:
                i2 = 90;
                break;
            case 107:
            case AnonymousClass74N.A03:
            case 109:
            case 110:
                i2 = 28;
                break;
            case 111:
                i2 = 1;
                break;
            case 113:
                i2 = 3;
                break;
            case 114:
                i2 = 7;
                break;
            default:
                return null;
        }
        return new C22919BVh(((long) i2) * 86400, false);
    }

    public static String A02(int i) {
        switch (i) {
            case 100:
                return "cask_testing__config_basic_files";
            case 101:
                return "cask_testing__config_basic_caches";
            case 102:
                return "cask_testing__config_basic_root";
            case 103:
                return "cask_testing__config_version_cache";
            case 104:
                return "cask_testing__config_version_files_with_default";
            case 105:
                return "stash__config_test";
            case 106:
                return "wa_effect_asset_disk_cache";
            case 107:
                return "wa_face_tracking_asset_disk_cache";
            case AnonymousClass74N.A03:
                return "wa_segmentation_asset_disk_cache";
            case 109:
                return "wa_multi_model_asset_disk_cache";
            case 110:
                return "wa_scripting_asset_disk_cache";
            case 111:
                return "wa_cask_ard_temp_store";
            case 112:
                return "wa_stash__gif_preview_cache";
            case 113:
                return "wa_stash__ar_effects_cache";
            case 114:
                return "wa_android_cdl";
            default:
                return null;
        }
    }
}
