package X;

import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.SingleSelectionDialogRadioGroup;
import java.util.List;

/* renamed from: X.4Qr  reason: invalid class name and case insensitive filesystem */
public final class C86194Qr {
    public List A00 = C18460wS.A00;
    public final AnonymousClass1DS A01;
    public final C41731wy A02;
    public final AnonymousClass1G3 A03;
    public final AnonymousClass1G0 A04;

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.appcompat.widget.AppCompatRadioButton, android.widget.TextView, android.widget.CompoundButton, android.view.View, X.3Rx] */
    public final void A00(SingleSelectionDialogRadioGroup singleSelectionDialogRadioGroup, Object obj, List list) {
        C18070vi.A0d(singleSelectionDialogRadioGroup, 0);
        this.A00 = list;
        singleSelectionDialogRadioGroup.removeAllViews();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            AnonymousClass4M8 r6 = (AnonymousClass4M8) next;
            ? appCompatRadioButton = new AppCompatRadioButton(AnonymousClass3MY.A04(singleSelectionDialogRadioGroup));
            if (!appCompatRadioButton.A01) {
                appCompatRadioButton.A01 = true;
                appCompatRadioButton.generatedComponent();
            }
            int A012 = AnonymousClass3MW.A01(appCompatRadioButton.getResources(), 2131168774);
            int A013 = AnonymousClass3MW.A01(appCompatRadioButton.getResources(), 2131168777);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            layoutParams.setMargins(0, A012, 0, A012);
            appCompatRadioButton.setLayoutParams(layoutParams);
            appCompatRadioButton.setPaddingRelative(A013, 0, 0, 0);
            singleSelectionDialogRadioGroup.addView(appCompatRadioButton);
            String str = r6.A01;
            appCompatRadioButton.setText(str);
            appCompatRadioButton.setChecked(C18070vi.A18(r6.A00, obj));
            appCompatRadioButton.setTag(str);
            i = i2;
        }
        singleSelectionDialogRadioGroup.setOnCheckedChangeListener(new C90914eq(singleSelectionDialogRadioGroup, this, list));
    }

    public C86194Qr() {
        C25701Ph r0 = new C25701Ph(C25691Pg.SUSPEND, 0, 1);
        this.A03 = r0;
        this.A04 = r0;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A02 = A0o;
        this.A01 = A0o;
    }
}
