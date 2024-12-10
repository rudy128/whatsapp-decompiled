package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* renamed from: X.72s  reason: invalid class name and case insensitive filesystem */
public class C1407272s {
    public static final Comparator A05 = new C147027Rn(42);
    public final C218617r A00;
    public final WamediaManager A01;
    public final C126546cu A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public static synchronized List A01(C1407272s r11, String str, String str2, String str3) {
        List list;
        String str4;
        synchronized (r11) {
            File A002 = A00(r11, str, str2);
            if (A002.exists()) {
                File[] listFiles = A002.listFiles();
                Arrays.sort(listFiles, A05);
                int length = listFiles.length;
                ArrayList A0z = C17880vN.A0z(length);
                String A012 = C137416vQ.A01(str, str2);
                int i = 0;
                while (true) {
                    if (i >= length) {
                        A0z.size();
                        list = Collections.unmodifiableList(A0z);
                        break;
                    }
                    File file = listFiles[i];
                    String name = file.getName();
                    C1418377d r3 = new C1418377d();
                    String decode = Uri.decode(C64062u9.A0A(name.substring(3)));
                    r3.A0F = decode;
                    r3.A0B = C17880vN.A0e(A002, name).getAbsolutePath();
                    r3.A01 = 2;
                    r3.A0E = "image/webp";
                    r3.A03 = 512;
                    r3.A02 = 512;
                    C136706uF A003 = C138906xt.A00(r3, r11.A04, file);
                    if (A003 != null) {
                        str4 = A003.A01(file);
                    } else {
                        str4 = null;
                    }
                    r3.A0C = str4;
                    r3.A0H = A012;
                    AnonymousClass73B A032 = ((AnonymousClass70H) r11.A03.get()).A03(r3.A01(), file.getAbsolutePath());
                    if (A032 != null) {
                        r3.A04 = A032;
                    }
                    if (str3 != null && TextUtils.equals(str3, decode)) {
                        A0z.size();
                        list = Collections.singletonList(r3);
                        break;
                    }
                    A0z.add(r3);
                    i++;
                }
            } else {
                list = Collections.emptyList();
            }
        }
        return list;
    }

    public synchronized void A02(String str, String str2, List list) {
        IllegalStateException illegalStateException;
        StringBuilder A10;
        InputStream inputStream;
        if (list.size() < 100) {
            File A002 = A00(this, str, str2);
            C64062u9.A0K(A002, (Set) null);
            if (A002.exists() || A002.mkdirs()) {
                int i = 0;
                while (i < list.size()) {
                    C1418377d r6 = (C1418377d) list.get(i);
                    String str3 = r6.A0F;
                    if (i < 100) {
                        if (i < 10) {
                            A10 = AnonymousClass000.A10();
                            A10.append("0");
                        } else {
                            A10 = AnonymousClass000.A10();
                        }
                        A10.append(i);
                        A10.append("_");
                        File A0e = C17880vN.A0e(A002, AnonymousClass001.A1H(Uri.encode(str3), ".webp", A10));
                        try {
                            C126546cu r4 = this.A02;
                            try {
                                inputStream = C108955ca.A0d(r4.A00).A07(Uri.parse(r6.A0B));
                                if (inputStream != null) {
                                    if (C64062u9.A0T(A0e, inputStream)) {
                                        if (r6.A04 != null) {
                                            this.A01.insertWebpMetadata(A0e, r6.A04.A04());
                                        }
                                        A0e.getAbsolutePath();
                                        inputStream.close();
                                        i++;
                                    }
                                }
                            } catch (FileNotFoundException e) {
                                Log.e("error openUri", e);
                                inputStream = null;
                            }
                            C64062u9.A0K(A002, (Set) null);
                            if (inputStream == null) {
                                break;
                            }
                            inputStream.close();
                            break;
                        } catch (IOException e2) {
                            Log.e("error closing the input stream.", e2);
                        } catch (Throwable th) {
                            AnonymousClass0DT.A00(th, th);
                        }
                    } else {
                        illegalStateException = AnonymousClass000.A0n(AnonymousClass001.A1I("ThirdPartyStickerStorage/createStickerFileName/sticker index is more more than 100. Index: ", AnonymousClass000.A10(), i));
                    }
                }
            } else {
                A002.getAbsolutePath();
            }
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            C17890vO.A15("ThirdPartyStickerStorage/addStickersInPack/total amount of stickers in pack is more than 100, size: ", A102, list);
            illegalStateException = AnonymousClass000.A0m(A102);
        }
        throw illegalStateException;
        return;
        throw th;
    }

    public C1407272s(C218617r r2, AnonymousClass11C r3, WamediaManager wamediaManager, AnonymousClass00H r5, AnonymousClass00H r6) {
        C126546cu r0 = new C126546cu(r3);
        this.A01 = wamediaManager;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r0;
        this.A04 = r6;
    }

    public static File A00(C1407272s r2, String str, String str2) {
        File A0e = C17880vN.A0e(C108945cZ.A16(r2.A00.A01), "stickers_cache");
        C218617r.A07(A0e, false);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(Uri.encode(str));
        A10.append(File.separatorChar);
        return C17880vN.A0e(A0e, AnonymousClass000.A0y(Uri.encode(str2), A10));
    }
}
