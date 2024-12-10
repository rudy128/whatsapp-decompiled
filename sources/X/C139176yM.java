package X;

import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6yM  reason: invalid class name and case insensitive filesystem */
public final class C139176yM {
    public final C219217x A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11C A02;
    public final C18030ve A03;
    public final WamediaManager A04;
    public final AnonymousClass1Q5 A05;

    public static final AnonymousClass77I A00(String str, int i, boolean z) {
        AnonymousClass77I A0P = C108995ce.A0P();
        A0P.A01 = 2;
        A0P.A00 = i;
        A0P.A02 = 2;
        A0P.A03 = str;
        A0P.A04 = z;
        return A0P;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.8Ah, java.lang.Object] */
    public final C160878Ah A01(AnonymousClass77I r19, boolean z) {
        boolean z2;
        Object r1;
        AnonymousClass77I r12 = r19;
        int i = r12.A01;
        int i2 = r12.A00;
        int i3 = r12.A02;
        String str = r12.A03;
        if (!r12.A05) {
            AnonymousClass11C r10 = this.A02;
            if (r10.A0O() != null) {
                String externalStorageState = Environment.getExternalStorageState();
                C219217x r4 = this.A00;
                if (r4.A0K(externalStorageState) || (("mounted_ro".equals(externalStorageState) && r4.A04(AnonymousClass73I.A04()) == 0) || ("mounted".equals(externalStorageState) && r4.A04(AnonymousClass73I.A02()) == 0))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ArrayList A13 = AnonymousClass000.A13();
                boolean z3 = z;
                if (z2 && i != 1) {
                    if (i2 == 7) {
                        try {
                            C18030ve r11 = this.A03;
                            WamediaManager wamediaManager = this.A04;
                            AnonymousClass1Q5 r13 = this.A05;
                            Uri contentUri = MediaStore.Files.getContentUri("external");
                            C18070vi.A0X(contentUri);
                            A13.add(new AnonymousClass65f(contentUri, r10, r11, wamediaManager, r13, str, i3, r12.A04, z3));
                        } catch (SQLiteException e) {
                            Log.e("MediaManager/makeMediaList exception", e);
                            this.A01.A0G("MediaManager/makeMediaList/sqliteException", e.getMessage(), true);
                        }
                    } else {
                        if ((i2 & 1) != 0) {
                            C18030ve r112 = this.A03;
                            WamediaManager wamediaManager2 = this.A04;
                            AnonymousClass1Q5 r132 = this.A05;
                            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            C18070vi.A0Z(uri);
                            A13.add(new AnonymousClass65e(uri, r10, r112, wamediaManager2, r132, str, i3, r12.A04, z3));
                        }
                        if ((i2 & 4) != 0) {
                            C18030ve r113 = this.A03;
                            WamediaManager wamediaManager3 = this.A04;
                            AnonymousClass1Q5 r133 = this.A05;
                            Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            C18070vi.A0Z(uri2);
                            A13.add(new C1187965b(uri2, r10, r113, wamediaManager3, r133, str, i3, r12.A04, z3));
                        }
                        if ((i2 & 2) != 0) {
                            C18030ve r114 = this.A03;
                            WamediaManager wamediaManager4 = this.A04;
                            AnonymousClass1Q5 r134 = this.A05;
                            Uri uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            C18070vi.A0Z(uri3);
                            A13.add(new AnonymousClass7H8(uri3, r10, r114, wamediaManager4, r134, str, i3, r12.A04));
                        }
                    }
                }
                if (i == 1 || i == 3) {
                    if ((i2 & 1) != 0) {
                        C18030ve r115 = this.A03;
                        WamediaManager wamediaManager5 = this.A04;
                        AnonymousClass1Q5 r135 = this.A05;
                        Uri uri4 = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                        C18070vi.A0Z(uri4);
                        A13.add(new AnonymousClass65e(uri4, r10, r115, wamediaManager5, r135, str, i3, r12.A04, z3));
                    }
                    if ((i2 & 2) != 0) {
                        C18030ve r116 = this.A03;
                        WamediaManager wamediaManager6 = this.A04;
                        AnonymousClass1Q5 r136 = this.A05;
                        Uri uri5 = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                        C18070vi.A0Z(uri5);
                        A13.add(new AnonymousClass7H8(uri5, r10, r116, wamediaManager6, r136, str, i3, r12.A04));
                    }
                }
                Iterator it = A13.iterator();
                C18070vi.A0X(it);
                while (it.hasNext()) {
                    Object next = it.next();
                    C18070vi.A0X(next);
                    AnonymousClass7H8 r14 = (AnonymousClass7H8) next;
                    if (AnonymousClass000.A1P(r14.getCount())) {
                        r14.close();
                        it.remove();
                    }
                }
                if (A13.size() == 1) {
                    r1 = A13.get(0);
                    C18070vi.A0b(r1);
                } else {
                    r1 = new AnonymousClass7H6((C160878Ah[]) A13.toArray(new C160878Ah[0]), i3);
                }
                return (C160878Ah) r1;
            }
        }
        return new Object();
    }

    public C139176yM(AnonymousClass190 r2, AnonymousClass11C r3, C219217x r4, C18030ve r5, WamediaManager wamediaManager, AnonymousClass1Q5 r7) {
        C18070vi.A0w(r5, r2, r3, wamediaManager, r7);
        C18070vi.A0d(r4, 6);
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = wamediaManager;
        this.A05 = r7;
        this.A00 = r4;
    }
}
