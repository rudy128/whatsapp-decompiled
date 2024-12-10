package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7Eu  reason: invalid class name and case insensitive filesystem */
public final class C143787Eu implements AnonymousClass1L0 {
    public final C25271No A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        int i;
        int i2;
        C136766uM r5 = (C136766uM) this.A02.get();
        if (((AnonymousClass6pA) r5.A03.get()).A01()) {
            AnonymousClass636 r8 = new AnonymousClass636();
            AnonymousClass00H r1 = r5.A01.A00;
            r8.A02 = C17880vN.A0n(C17880vN.A0B(r1).getInt("sticker_suggestion_triggered_count", 0));
            r8.A00 = C17880vN.A0n(C17880vN.A0B(r1).getInt("sticker_suggestion_icon_clicked_count", 0));
            r8.A01 = C17880vN.A0n(C17880vN.A0B(r1).getInt("sticker_suggestion_sticker_sent_count", 0));
            r8.A03 = C17880vN.A0B(r1).getString("sticker_suggestion_num_suggestions_array", "[]");
            r5.A02.CC7(r8);
            C17880vN.A1E(C17880vN.A0B(r1).edit().putInt("sticker_suggestion_triggered_count", 0).putInt("sticker_suggestion_icon_clicked_count", 0).putInt("sticker_suggestion_sticker_sent_count", 0), "sticker_suggestion_num_suggestions_array", "[]");
            r5.A00 = null;
        }
        C25271No r0 = this.A00;
        C25271No r43 = r0;
        ArrayList A13 = AnonymousClass000.A13();
        C25251Nm r2 = r0.A01;
        C18100vl r42 = r2.A05;
        long j = (long) C17880vN.A0C(r42).getInt("sticker_send_count", 0);
        long j2 = (long) C17880vN.A0C(r42).getInt("sticker_send_from_recent_count", 0);
        long j3 = (long) C17880vN.A0C(r42).getInt("sticker_send_from_favorites_count", 0);
        long j4 = (long) C17880vN.A0C(r42).getInt("sticker_send_from_pack_count", 0);
        long j5 = (long) C17880vN.A0C(r42).getInt("sticker_send_from_emotion_count", 0);
        long j6 = (long) C17880vN.A0C(r42).getInt("sticker_send_from_search_count", 0);
        long j7 = (long) C17880vN.A0C(r42).getInt("sticker_send_from_forward_count", 0);
        long j8 = (long) C17880vN.A0C(r42).getInt("sticker_send_first_party_count", 0);
        long j9 = (long) C17880vN.A0C(r42).getInt("sticker_send_animated_count", 0);
        Object obj = r2.A03;
        synchronized (obj) {
            i = C17880vN.A0C(r42).getInt("sticker_picker_opened_count", 0);
        }
        long j10 = (long) i;
        synchronized (obj) {
            i2 = C17880vN.A0C(r42).getInt("sticker_search_opened_count", 0);
        }
        long j11 = (long) i2;
        long A012 = (long) r2.A01();
        long A022 = (long) r2.A02();
        ArrayList arrayList = A13;
        Long A002 = A00(arrayList, j);
        Long A003 = A00(arrayList, j2);
        Long A004 = A00(arrayList, j3);
        ArrayList arrayList2 = A13;
        Long A005 = A00(arrayList2, j4);
        Long A006 = A00(arrayList2, j5);
        Long A007 = A00(arrayList2, j6);
        Long A008 = A00(arrayList2, j7);
        Long A009 = A00(A13, j8);
        Long A0010 = A00(A13, j9);
        ArrayList arrayList3 = A13;
        Long A0011 = A00(arrayList3, j10);
        Long A0012 = A00(arrayList3, j11);
        Long A0013 = A00(arrayList3, A012);
        Long A0014 = A00(arrayList3, A022);
        AnonymousClass64F r22 = new AnonymousClass64F();
        r22.A04 = A002;
        r22.A0B = A003;
        r22.A09 = A004;
        r22.A0A = A005;
        r22.A08 = A006;
        r22.A0C = A007;
        r22.A05 = A008;
        r22.A07 = A009;
        r22.A06 = A0010;
        r22.A02 = A0011;
        r22.A03 = A0012;
        r22.A00 = A0013;
        r22.A01 = A0014;
        Iterator it = A13.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C17890vO.A07(it) > 0) {
                    r43.A00.CC7(r22);
                    C17880vN.A1C(C17890vO.A0A(r42).putInt("sticker_send_count", 0).putInt("sticker_send_from_recent_count", 0).putInt("sticker_send_from_favorites_count", 0).putInt("sticker_send_from_pack_count", 0).putInt("sticker_send_from_emotion_count", 0).putInt("sticker_send_from_search_count", 0).putInt("sticker_send_from_forward_count", 0).putInt("sticker_send_first_party_count", 0).putInt("sticker_send_animated_count", 0).putInt("sticker_picker_opened_count", 0).putInt("sticker_search_opened_count", 0).putInt("sticker_add_to_favorites_count", 0), "sticker_pack_delete_count", 0);
                    break;
                }
            } else {
                break;
            }
        }
        ((C217917k) this.A01.get()).A00();
    }

    public C143787Eu(C25271No r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static Long A00(AbstractCollection abstractCollection, long j) {
        Long valueOf = Long.valueOf(j);
        abstractCollection.add(valueOf);
        return valueOf;
    }
}
