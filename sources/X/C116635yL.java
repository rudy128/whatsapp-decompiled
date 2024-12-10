package X;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import java.util.List;

/* renamed from: X.5yL  reason: invalid class name and case insensitive filesystem */
public final class C116635yL extends C110225f8 implements SectionIndexer {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final AnonymousClass1VW A05;
    public final C37451pZ A06;
    public final InviteNonWhatsAppContactPickerActivity A07;
    public final C18000vb A08;

    public View getView(int i, View view, ViewGroup viewGroup) {
        C129606i4 r6;
        C18070vi.A0d(viewGroup, 2);
        C1599786p r4 = (C1599786p) this.A01.get(i);
        C17960vV.A07(r4);
        C18070vi.A0X(r4);
        if (r4 instanceof AnonymousClass7EJ) {
            if (view == null) {
                view = AnonymousClass3MX.A0B(LayoutInflater.from(this.A07), viewGroup, 2131625857, false);
                view.setImportantForAccessibility(2);
            }
            TextView A0C = C108975cc.A0C(view);
            C43421zm.A04(A0C);
            A0C.setText(((AnonymousClass7EJ) r4).A00);
            return view;
        }
        if (view == null) {
            view = AnonymousClass3MX.A0B(LayoutInflater.from(this.A07), viewGroup, 2131626450, false);
            r6 = new C129606i4(view);
            view.setTag(r6);
        } else {
            Object tag = view.getTag();
            C18070vi.A0z(tag, "null cannot be cast to non-null type com.whatsapp.contact.picker.viewholders.ContactsViewHolder");
            r6 = (C129606i4) tag;
        }
        if (r4 instanceof AnonymousClass7ED) {
            view.setImportantForAccessibility(2);
            r6.A00.setVisibility(4);
            r6.A01.setText(((AnonymousClass7ED) r4).A00);
            r6.A02.setVisibility(8);
            r6.A04.A04(8);
            return view;
        } else if (r4 instanceof AnonymousClass7EH) {
            AnonymousClass7EH r42 = (AnonymousClass7EH) r4;
            ImageView imageView = r6.A00;
            imageView.setVisibility(0);
            this.A05.A0B(imageView, (AnonymousClass1VX) null, 2131231047);
            AnonymousClass1E7 contact = r42.getContact();
            C17960vV.A07(contact);
            C18070vi.A0X(contact);
            this.A06.A07(imageView, contact);
            r6.A01.A0S(r42.A00, this.A00, 0, false);
            TextEmojiLabel textEmojiLabel = r6.A02;
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.setText(r42.A00());
            C28931bI r3 = r6.A04;
            AnonymousClass3MY.A0x(this.A07, (TextView) AnonymousClass3MY.A0I(r3, 0), 2131891450);
            C90004dN.A00(r3.A02(), this, r42, 38);
            return view;
        } else {
            throw AnonymousClass000.A0n(AnonymousClass001.A1E(r4, "unexpected item type: ", AnonymousClass000.A10()));
        }
    }

    public int getCount() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    public int getPositionForSection(int i) {
        List list = this.A04;
        C18070vi.A0d(list, 1);
        if (i >= list.size() || i < 0) {
            return -1;
        }
        return AnonymousClass001.A0n(list, i);
    }

    public int getSectionForPosition(int i) {
        List list = this.A02;
        List list2 = this.A03;
        List list3 = this.A04;
        C18070vi.A0o(list, list2, list3);
        if (i < 0) {
            return 0;
        }
        if (i >= list.size()) {
            return AnonymousClass3MX.A01(list2);
        }
        int A012 = AnonymousClass3MX.A01(list3);
        if (A012 < 0) {
            return 0;
        }
        while (true) {
            int i2 = A012 - 1;
            if (AnonymousClass001.A0n(list3, A012) <= i) {
                return A012;
            }
            if (i2 < 0) {
                return 0;
            }
            A012 = i2;
        }
    }

    public /* bridge */ /* synthetic */ Object[] getSections() {
        return this.A03.toArray(new String[0]);
    }

    public C116635yL(AnonymousClass1VW r2, C37451pZ r3, InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity, C18000vb r5, List list) {
        this.A07 = inviteNonWhatsAppContactPickerActivity;
        this.A01 = list;
        this.A05 = r2;
        this.A06 = r3;
        this.A02 = list;
        this.A08 = r5;
        C18460wS r0 = C18460wS.A00;
        this.A03 = r0;
        this.A04 = r0;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A002 = AnonymousClass6W7.A00(this.A08, this.A02);
        Object obj = A002.first;
        C18070vi.A0W(obj);
        this.A03 = (List) obj;
        Object obj2 = A002.second;
        C18070vi.A0W(obj2);
        this.A04 = (List) obj2;
    }
}
