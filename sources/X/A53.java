package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A53 {
    public static A53 A03;
    public String A00;
    public final Context A01;
    public final File A02;

    public Set A04(int i) {
        String str;
        int length;
        Object value;
        Map map;
        File A032 = A03(A00(i));
        if (!A032.isDirectory()) {
            map = Collections.emptyMap();
        } else {
            if (i == 103 || i == 104) {
                str = "__version__";
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                map = Collections.singletonMap(A032, (Object) null);
            } else {
                String[] split = str.split("/");
                HashMap A11 = C17880vN.A11();
                HashMap A112 = C17880vN.A11();
                A11.put(A032, (Object) null);
                for (String equals : split) {
                    boolean equals2 = equals.equals((Object) null);
                    Iterator A0i = C17890vO.A0i(A11);
                    while (A0i.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A0i);
                        File[] listFiles = ((File) A16.getKey()).listFiles();
                        if (listFiles != null && (length = listFiles.length) != 0) {
                            int i2 = 0;
                            do {
                                File file = listFiles[i2];
                                if (file.isDirectory()) {
                                    if (equals2) {
                                        value = file.getName();
                                    } else {
                                        value = A16.getValue();
                                    }
                                    A112.put(file, value);
                                }
                                i2++;
                            } while (i2 < length);
                        }
                    }
                    A11.clear();
                    A11.putAll(A112);
                    A112.clear();
                }
                map = A11;
            }
        }
        return map.keySet();
    }

    public A53(Context context) {
        this.A01 = context.getApplicationContext();
        this.A02 = A01(context);
    }

    public static Pair A00(int i) {
        int i2;
        String str;
        switch (i) {
            case 100:
            case 104:
            case 111:
                i2 = 2;
                break;
            case 101:
            case 103:
            case 105:
            case 106:
            case 107:
            case AnonymousClass74N.A03:
            case 109:
            case 110:
            case 113:
            case 114:
                i2 = 3;
                break;
            case 102:
                i2 = 1;
                break;
            case 112:
                i2 = 5;
                break;
            default:
                i2 = 0;
                break;
        }
        Integer valueOf = Integer.valueOf(i2);
        switch (i) {
            case 100:
                str = "cask_testing__config_basic_files";
                break;
            case 101:
                str = "cask_testing__config_basic_caches";
                break;
            case 102:
                str = "cask_testing__config_basic_root";
                break;
            case 103:
                str = "cask_testing__config_version_cache";
                break;
            case 104:
                str = "cask_testing__config_version_files_with_default";
                break;
            case 105:
                str = "wa_stash_example";
                break;
            case 106:
                str = "wa_effect_asset_disk_cache";
                break;
            case 107:
                str = "wa_face_tracking_asset_disk_cache";
                break;
            case AnonymousClass74N.A03:
                str = "wa_segmentation_asset_disk_cache";
                break;
            case 109:
                str = "wa_multi_model_asset_disk_cache";
                break;
            case 110:
                str = "wa_scripting_asset_disk_cache";
                break;
            case 111:
                str = "wa_cask_ard_temp_store";
                break;
            case 112:
                str = "gif/gif_preview_cache";
                break;
            case 113:
                str = "ar_effects_cache";
                break;
            case 114:
                str = "cdl";
                break;
            default:
                str = null;
                break;
        }
        return C108945cZ.A0N(valueOf, str);
    }

    public static File A01(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && !TextUtils.isEmpty(applicationInfo.dataDir)) {
            return C108945cZ.A17(applicationInfo.dataDir);
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getParentFile();
        }
        throw AnonymousClass000.A0n("Path Factory initialised without a valid path");
    }

    public File A02(int i) {
        Pair A002 = A00(i);
        if (TextUtils.isEmpty((CharSequence) null)) {
            return A03(C108945cZ.A0N(A002.first, A002.second));
        }
        throw AnonymousClass000.A0s("contains");
    }

    public File A03(Pair pair) {
        File file;
        switch (C108965cb.A01(pair)) {
            case -1:
                throw AnonymousClass000.A0n("Invalid source path");
            case 0:
            case 1:
                file = this.A02;
                break;
            case 2:
                file = this.A01.getFilesDir();
                break;
            case 3:
                file = this.A01.getCacheDir();
                break;
            case 4:
                file = this.A01.getExternalFilesDir((String) null);
                break;
            case 5:
                file = this.A01.getExternalCacheDir();
                break;
            default:
                throw AnonymousClass000.A0k("Cask path factory cannot handle this location");
        }
        if (file == null) {
            String str = this.A00;
            if (str == null) {
                str = C17890vO.A0Q();
            }
            this.A00 = str;
            file = C17880vN.A0e(this.A02, AnonymousClass001.A1H("cache/tmp_invalid_path/", str, AnonymousClass000.A10()));
        }
        int A012 = C108965cb.A01(pair);
        if (A012 != 0) {
            if (A012 == 1) {
                File file2 = this.A02;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("app_");
                return AnonymousClass8BW.A0X(file2, (String) pair.second, A10);
            } else if (!(A012 == 2 || A012 == 3 || A012 == 4 || A012 == 5)) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Cask path factory cannot handle this location = ");
                throw AnonymousClass001.A12((String) pair.second, A102);
            }
        }
        return C17880vN.A0e(file, (String) pair.second);
    }
}
