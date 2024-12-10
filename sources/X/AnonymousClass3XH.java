package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.WaEditText;
import java.util.List;

/* renamed from: X.3XH  reason: invalid class name */
public final class AnonymousClass3XH extends C38391rD {
    public int A00 = -1;
    public CharSequence A01 = "";
    public final List A02;
    public final C22821Di A03;
    public final boolean A04;
    public final AnonymousClass11C A05;
    public final C18000vb A06;
    public final AnonymousClass1L2 A07;
    public final AnonymousClass1KW A08;
    public final C18030ve A09;
    public final C18010vc A0A;

    public void A0R(C42011xT r3) {
        C18070vi.A0d(r3, 0);
        if (r3 instanceof AnonymousClass3ZU) {
            AnonymousClass3ZU r32 = (AnonymousClass3ZU) r3;
            C89564cf r1 = r32.A01;
            if (r1 != null) {
                r32.A03.removeTextChangedListener(r1);
            }
            AnonymousClass48A r12 = r32.A00;
            if (r12 != null) {
                r32.A03.removeTextChangedListener(r12);
            }
            r32.A01 = null;
            r32.A00 = null;
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131624291, viewGroup, false);
            C18070vi.A0b(inflate);
            if (this.A04) {
                int A012 = C62762rw.A01(viewGroup.getContext(), 16.0f);
                inflate.setPadding(A012, 0, A012, 0);
            }
            return new AnonymousClass3Y1(inflate);
        } else if (i == 1) {
            View inflate2 = AnonymousClass3MZ.A0D(viewGroup).inflate(2131624294, viewGroup, false);
            C18070vi.A0b(inflate2);
            if (this.A04) {
                int A013 = C62762rw.A01(viewGroup.getContext(), 8.0f);
                int A014 = C62762rw.A01(viewGroup.getContext(), 16.0f);
                inflate2.setPadding(A014, 0, A014, A013);
            }
            C18030ve r9 = this.A09;
            AnonymousClass1KW r8 = this.A08;
            return new AnonymousClass3ZU(inflate2, this.A05, this.A06, this.A07, r8, r9, this.A0A);
        } else {
            throw AnonymousClass000.A0n("Unsupported view type");
        }
    }

    public int A0Q() {
        return this.A02.size();
    }

    public void Bmc(C42011xT r19, int i) {
        C42011xT r1 = r19;
        C18070vi.A0d(r1, 0);
        int i2 = r1.A01;
        boolean z = false;
        int i3 = i;
        if (i2 == 0) {
            AnonymousClass3Y1 r12 = (AnonymousClass3Y1) r1;
            String str = ((C87014Ty) this.A02.get(i3)).A02;
            if (i3 == this.A00) {
                z = true;
            }
            C99084sF r2 = new C99084sF(this, i3, 0);
            AppCompatRadioButton appCompatRadioButton = r12.A00;
            appCompatRadioButton.setText(str);
            appCompatRadioButton.setChecked(z);
            AnonymousClass3MZ.A1I(appCompatRadioButton, r2, 29);
        } else if (i2 == 1) {
            AnonymousClass3ZU r13 = (AnonymousClass3ZU) r1;
            String str2 = ((C87014Ty) this.A02.get(i3)).A02;
            boolean A1T = AnonymousClass000.A1T(i3, this.A00);
            CharSequence charSequence = this.A01;
            C99084sF r5 = new C99084sF(this, i3, 1);
            C99244sV A002 = C99244sV.A00(this, 1);
            AppCompatRadioButton appCompatRadioButton2 = r13.A02;
            appCompatRadioButton2.setText(str2);
            appCompatRadioButton2.setChecked(A1T);
            AnonymousClass3MZ.A1I(appCompatRadioButton2, r5, 28);
            WaEditText waEditText = r13.A03;
            C89564cf r0 = r13.A01;
            if (r0 != null) {
                waEditText.removeTextChangedListener(r0);
            }
            r13.A01 = new AnonymousClass48E(A002, 0);
            AnonymousClass48A r02 = r13.A00;
            if (r02 != null) {
                waEditText.removeTextChangedListener(r02);
            }
            C18030ve r11 = r13.A09;
            AnonymousClass1KW r10 = r13.A08;
            AnonymousClass11C r7 = r13.A05;
            C18000vb r8 = r13.A06;
            C18010vc r122 = r13.A0A;
            r13.A00 = new AnonymousClass48A(waEditText, r13.A04, r7, r8, r13.A07, r10, r11, r122, 30, 30, false, false, false);
            waEditText.setText(charSequence);
            waEditText.addTextChangedListener(r13.A00);
            waEditText.addTextChangedListener(r13.A01);
            if (charSequence.length() > 0) {
                waEditText.requestFocus();
                waEditText.setSelection(waEditText.length());
            }
        }
    }

    public int getItemViewType(int i) {
        if (!"other".equalsIgnoreCase(((C87014Ty) this.A02.get(i)).A01) || this.A00 != i) {
            return 0;
        }
        return 1;
    }

    public AnonymousClass3XH(AnonymousClass11C r2, C18000vb r3, AnonymousClass1L2 r4, AnonymousClass1KW r5, C18030ve r6, C18010vc r7, List list, C22821Di r9, boolean z) {
        this.A09 = r6;
        this.A08 = r5;
        this.A05 = r2;
        this.A06 = r3;
        this.A02 = list;
        this.A0A = r7;
        this.A07 = r4;
        this.A04 = z;
        this.A03 = r9;
    }
}
