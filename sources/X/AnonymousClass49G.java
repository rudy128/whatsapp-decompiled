package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionPickerView;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.49G  reason: invalid class name */
public class AnonymousClass49G extends A34 {
    public final AnonymousClass122 A00;
    public final AnonymousClass1W6 A01;
    public final CharSequence A02;
    public final /* synthetic */ MentionPickerView A03;

    public AnonymousClass49G(AnonymousClass122 r1, MentionPickerView mentionPickerView, AnonymousClass1W6 r3, CharSequence charSequence) {
        this.A03 = mentionPickerView;
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = charSequence;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        HashSet A12 = C17880vN.A12();
        int i = 0;
        AnonymousClass1EC r6 = ((AnonymousClass1EC[]) objArr)[0];
        if (r6 == null) {
            return A12;
        }
        Cursor cursor = this.A00.BUp(r6, 15, 1, -1).A00;
        try {
            cursor.moveToPrevious();
            while (cursor.moveToNext() && i < 15) {
                AnonymousClass206 A022 = this.A01.A02(cursor, r6);
                C17960vV.A07(A022);
                if (!(A022 instanceof C436420i)) {
                    if (AnonymousClass4aJ.A05(this.A03.A03, A022.A0h)) {
                        A12.add((UserJid) A022.A0H());
                    }
                }
                i++;
            }
            cursor.close();
            return A12;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Set set = (Set) obj;
        MentionPickerView mentionPickerView = this.A03;
        mentionPickerView.A0O = true;
        AnonymousClass3XO r4 = mentionPickerView.A0J;
        C98884rs r1 = r4.A03;
        if (r1 == null) {
            AnonymousClass11S r3 = r4.A0C;
            C24921Me r2 = r4.A0E;
            r1 = new C98884rs(r3, r2, r2.A08((AnonymousClass1E7) null, AnonymousClass3MW.A0i(r4.A0I)));
            r4.A03 = r1;
        }
        r1.A00 = set;
        mentionPickerView.A0J.getFilter().filter(this.A02);
    }
}
