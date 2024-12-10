package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4Xe  reason: invalid class name */
public final class AnonymousClass4Xe {
    public final C19880zA A00;

    public final void A02(Context context, C87804Xb r10, AnonymousClass206 r11, List list, List list2, List list3, int i) {
        Bundle bundle;
        C18070vi.A0g(list3, 4, r10);
        Intent A002 = A00(context, r11, C29431cG.A0k(list2, list));
        if (A002 != null) {
            AnonymousClass01E r4 = (AnonymousClass01E) AnonymousClass1L9.A01(context, AnonymousClass01E.class);
            if (!AnonymousClass745.A00) {
                bundle = null;
            } else {
                ArrayList A13 = AnonymousClass000.A13();
                if (i < 3 || list.size() == 4) {
                    A002.putExtra("start_index", i);
                    r10.A01((AnonymousClass21V) list.get(i), A13);
                } else {
                    int i2 = 0;
                    do {
                        ((C87804Xb) list3.get(i2)).A01((AnonymousClass21V) list.get(i2), A13);
                        i2++;
                    } while (i2 < 3);
                }
                C19760yx[] r1 = (C19760yx[]) A13.toArray(new C19760yx[0]);
                bundle = C1406772n.A01(r4, (C19760yx[]) Arrays.copyOf(r1, r1.length)).A00.toBundle();
                r4.A2k(new AnonymousClass3SM(r4, r10));
            }
            r4.startActivity(A002, bundle);
        }
    }

    public final Integer A01(AnonymousClass206 r3) {
        int i = r3.A0u;
        if (i == 0) {
            C19880zA r1 = this.A00;
            if (r1.A07() && ((C25811Ps) r1.A03()).A0F(r3)) {
                return AnonymousClass00R.A0N;
            }
        } else if (i == 1 || i == 3) {
            String A18 = ((AnonymousClass21V) r3).A18();
            if (A18 == null || A18.length() == 0) {
                return AnonymousClass00R.A01;
            }
        } else if (i == 20 && AnonymousClass25B.A00(r3) == null) {
            return AnonymousClass00R.A0C;
        }
        return AnonymousClass00R.A00;
    }

    public AnonymousClass4Xe(C19880zA r1) {
        this.A00 = r1;
    }

    public static final Intent A00(Context context, AnonymousClass206 r8, List list) {
        AnonymousClass1BI r6 = null;
        if (list.isEmpty()) {
            return null;
        }
        long[] jArr = new long[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jArr[i] = AnonymousClass3MW.A0k(list, i).A0x;
        }
        AnonymousClass205 r0 = r8.A0v;
        AnonymousClass1BI r4 = r0.A00;
        if (!r0.A02 && (!C22971Dz.A0e(r4) || (r6 = r8.A0H()) == null)) {
            r6 = r4;
        }
        Long valueOf = Long.valueOf(r8.A0x);
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity");
        A0A.putExtra("message_ids", jArr);
        AnonymousClass3MY.A13(A0A, r6, "jid");
        AnonymousClass3MY.A13(A0A, r4, "chat_jid");
        if (valueOf != null) {
            A0A.putExtra("album_message_id", valueOf);
        }
        return A0A;
    }
}
