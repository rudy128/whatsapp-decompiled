package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.7HZ  reason: invalid class name */
public final class AnonymousClass7HZ implements AnonymousClass891 {
    public final int A00;
    public final Context A01;
    public final Uri A02;
    public final AnonymousClass1T1 A03;
    public final C18000vb A04;
    public final AnonymousClass1KW A05;
    public final C18030ve A06;
    public final AnonymousClass72S A07;
    public final C25291Nq A08;
    public final C26631Sw A09;

    public Bitmap BhZ() {
        String str;
        Uri uri;
        AnonymousClass72S r3 = this.A07;
        Integer A0D = r3.A0D();
        if (A0D != null && A0D.intValue() == 1) {
            try {
                File A092 = r3.A09();
                if (A092 == null || (uri = Uri.fromFile(A092)) == null) {
                    uri = this.A02;
                }
                Uri.Builder buildUpon = uri.buildUpon();
                C18070vi.A0X(buildUpon);
                C26521Sl.A0Z(buildUpon, r3);
                C25291Nq r11 = this.A08;
                Uri build = buildUpon.build();
                int i = this.A00;
                Bitmap A072 = r11.A07(build, i, i);
                if (r3.A0F() != null) {
                    if (!A072.isMutable()) {
                        A072 = A072.copy(Bitmap.Config.ARGB_8888, true);
                    }
                    C139426yp r5 = C1409573s.A06;
                    String A0F = r3.A0F();
                    Context context = this.A01;
                    AnonymousClass1KW r9 = this.A05;
                    C18000vb r8 = this.A04;
                    C26631Sw r12 = this.A09;
                    C1409573s A022 = r5.A02(context, this.A03, r8, r9, this.A06, r11, r12, A0F);
                    if (A022 != null) {
                        C18070vi.A0b(A072);
                        A022.A07(A072);
                    }
                    C18070vi.A0b(A072);
                }
                return A072;
            } catch (AnonymousClass2RM e) {
                e = e;
                str = "BotMediaThumbnailLoader/load/not an image: ";
                Log.e(str, e);
                return null;
            } catch (IOException e2) {
                e = e2;
                str = "BotMediaThumbnailLoader/load/io exception: ";
                Log.e(str, e);
                return null;
            } catch (OutOfMemoryError e3) {
                e = e3;
                str = "BotMediaThumbnailLoader/load/out of memory: ";
                Log.e(str, e);
                return null;
            }
        }
        return null;
    }

    public AnonymousClass7HZ(Context context, Uri uri, AnonymousClass1T1 r4, C18000vb r5, AnonymousClass1KW r6, C18030ve r7, AnonymousClass72S r8, C25291Nq r9, C26631Sw r10, int i) {
        C18070vi.A0w(r7, r5, r9, r6, r10);
        C18070vi.A0d(r4, 6);
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A05 = r6;
        this.A09 = r10;
        this.A03 = r4;
        this.A01 = context;
        this.A02 = uri;
        this.A07 = r8;
        this.A00 = i;
    }

    public String Ba8() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A02);
        A10.append('-');
        A10.append(this.A07.A0H());
        return AnonymousClass000.A0y("-bot-media-loader", A10);
    }
}
