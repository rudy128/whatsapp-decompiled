package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.npci.upi.security.pinactivitycomponent.s;

/* renamed from: X.8DP  reason: invalid class name */
public class AnonymousClass8DP extends FrameLayout implements BDB {
    public int A00;
    public int A01;
    public Object A02;
    public ArrayList A03;

    public void BAJ(Drawable drawable, View.OnClickListener onClickListener, String str, boolean z, boolean z2) {
        String str2;
        Drawable drawable2;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i < arrayList.size()) {
                boolean equals = AnonymousClass8BR.A1C(arrayList, i).A0F.equals("CARDDETAILS");
                AnonymousClass8Do r8 = (AnonymousClass8Do) arrayList.get(i);
                if (equals) {
                    r8.A0I = true;
                    if (i == 0) {
                        r8 = AnonymousClass8BR.A1C(arrayList, i);
                        str2 = getContext().getString(2131899122);
                    } else if (i == 1) {
                        drawable2 = C24261Jm.A00(getContext(), 2131231877);
                        AnonymousClass8BR.A1C(this.A03, i).setTitle(C17880vN.A0q(getContext(), AnonymousClass8BR.A1C(this.A03, 0).getInputValue(), new Object[1], 0, 2131898768));
                        r8 = AnonymousClass8BR.A1C(this.A03, i);
                        str2 = getContext().getString(2131898931);
                        r8.BAJ(drawable2, onClickListener, str2, z, z2);
                        i++;
                    } else {
                        i++;
                    }
                } else {
                    str2 = str;
                }
                drawable2 = drawable;
                r8.BAJ(drawable2, onClickListener, str2, z, z2);
                i++;
            } else {
                return;
            }
        }
    }

    public int BJm() {
        return getInputValue().length();
    }

    public void setFormDataTag(Object obj) {
        this.A02 = obj;
    }

    public void setText(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i < arrayList.size()) {
                AnonymousClass8BR.A1C(arrayList, i).setText(str);
                i++;
            } else {
                return;
            }
        }
    }

    public void A00(ArrayList arrayList, B6S b6s) {
        this.A03 = arrayList;
        addView((View) arrayList.get(0));
        AnonymousClass8BR.A1C(this.A03, 0).A0H = b6s;
        this.A00 = 0;
        this.A01 = AnonymousClass3Ma.A09(this).widthPixels;
        int i = 1;
        while (true) {
            ArrayList arrayList2 = this.A03;
            if (i < arrayList2.size()) {
                AnonymousClass8Do A1C = AnonymousClass8BR.A1C(arrayList2, i);
                A1C.A0H = b6s;
                A1C.setX((float) this.A01);
                addView(A1C);
                i++;
            } else {
                return;
            }
        }
    }

    public void BAH(String str) {
        ((s) ((AnonymousClass8Do) AnonymousClass8BS.A0Y(this.A03)).A0H).A26(str);
    }

    public boolean BAI() {
        B6S b6s;
        Context context;
        int i;
        String inputValue = AnonymousClass8BR.A1C(this.A03, this.A00).getInputValue();
        ArrayList arrayList = this.A03;
        int i2 = this.A00;
        if (AnonymousClass8BR.A1C(arrayList, i2).A00 == inputValue.length()) {
            if (i2 == arrayList.size() - 1) {
                AnonymousClass8BU.A1M(arrayList, i2);
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = this.A03;
                    if (i3 >= arrayList2.size()) {
                        break;
                    } else if (AnonymousClass8BR.A1C(arrayList2, 0).A0F.equals("CARDDETAILS")) {
                        AnonymousClass8BR.A1C(arrayList2, this.A00).A0L = true;
                        break;
                    } else if (!AnonymousClass8BR.A1C(arrayList2, i3).getInputValue().equals(inputValue)) {
                        int i4 = 0;
                        while (true) {
                            ArrayList arrayList3 = this.A03;
                            if (i4 >= arrayList3.size()) {
                                break;
                            }
                            AnonymousClass8BR.A1C(arrayList3, i4).setText("");
                            i4++;
                        }
                        int i5 = this.A00;
                        if (i5 != 0) {
                            TextView A0E = C17880vN.A0E((View) this.A03.get(i5 - 1), 2131430977);
                            A0E.setEnabled(false);
                            A0E.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(2131232415), (Drawable) null, (Drawable) null, (Drawable) null);
                            A0E.setText(2131898681);
                            ArrayList arrayList4 = this.A03;
                            int i6 = this.A00;
                            AnonymousClass8BR.A1C(arrayList4, i6).A0J = false;
                            ((View) arrayList4.get(i6)).animate().x((float) this.A01);
                            ((View) this.A03.get(this.A00 - 1)).animate().x(0.0f);
                            int i7 = this.A00 - 1;
                            this.A00 = i7;
                            AnonymousClass8BU.A1M(this.A03, i7);
                        }
                        b6s = AnonymousClass8BR.A1C(this.A03, i3).A0H;
                        context = getContext();
                        i = 2131899083;
                    } else {
                        i3++;
                    }
                }
            } else if (!AnonymousClass8BR.A1C(arrayList, i2).A0K) {
                AnonymousClass8BR.A1C(arrayList, i2).A0L = true;
                int i8 = this.A00;
                ArrayList arrayList5 = this.A03;
                boolean z = false;
                if (i8 < arrayList5.size() - 1) {
                    TextView A0E2 = C17880vN.A0E((View) arrayList5.get(i8 + 1), 2131430977);
                    A0E2.setEnabled(false);
                    A0E2.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(2131232415), (Drawable) null, (Drawable) null, (Drawable) null);
                    A0E2.setText(2131898681);
                    ArrayList arrayList6 = this.A03;
                    int i9 = this.A00;
                    AnonymousClass8BR.A1C(arrayList6, i9).A0J = false;
                    ((View) arrayList6.get(i9)).animate().x((float) (-this.A01));
                    ((View) this.A03.get(this.A00 + 1)).animate().x(0.0f);
                    int i10 = this.A00 + 1;
                    this.A00 = i10;
                    AnonymousClass8BU.A1M(this.A03, i10);
                    z = true;
                }
                return !z;
            }
            return true;
        }
        boolean equals = AnonymousClass8BR.A1C(arrayList, 0).A0F.equals("CARDDETAILS");
        b6s = AnonymousClass8BR.A1C(arrayList, 0).A0H;
        context = getContext();
        if (equals) {
            i = 2131898961;
            if (i2 == 0) {
                i = 2131898960;
            }
        } else {
            ((s) b6s).A26(context.getString(2131898813));
            AnonymousClass8BU.A1M(this.A03, this.A00);
            return false;
        }
        ((s) b6s).A26(context.getString(i));
        return false;
    }

    public void BCs() {
        int i = this.A00;
        if (i != 0) {
            ((View) this.A03.get(i)).animate().x((float) this.A01);
            ((View) this.A03.get(this.A00 - 1)).animate().x(0.0f);
            int i2 = this.A00 - 1;
            this.A00 = i2;
            AnonymousClass8BU.A1M(this.A03, i2);
        }
    }

    public boolean BDg() {
        return AnonymousClass8BR.A1C(this.A03, this.A00).BDg();
    }

    public boolean BI1() {
        return AnonymousClass8BR.A1C(this.A03, this.A00).BI1();
    }

    public Object getFormDataTag() {
        Object obj = this.A02;
        if (obj == null) {
            return ((AnonymousClass8Do) AnonymousClass8BS.A0Y(this.A03)).A0C;
        }
        return obj;
    }

    public String getInputValue() {
        StringBuilder A11;
        String inputValue;
        ArrayList arrayList = this.A03;
        if (!AnonymousClass8BR.A1C(arrayList, 0).A0F.equals("CARDDETAILS")) {
            return AnonymousClass8BR.A1C(arrayList, 0).getInputValue();
        }
        String str = "";
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.A03;
            if (i >= arrayList2.size()) {
                return str;
            }
            if (i != 1 || !AnonymousClass8BR.A1C(arrayList2, 0).A0K) {
                A11 = AnonymousClass000.A11(str);
                inputValue = AnonymousClass8BR.A1C(arrayList2, i).getInputValue();
            } else {
                A11 = AnonymousClass000.A11(str);
                inputValue = "0149";
            }
            str = AnonymousClass000.A0y(inputValue, A11);
            i++;
        }
    }

    public boolean getTextEntered() {
        return AnonymousClass8BR.A1C(this.A03, this.A00).A0L;
    }

    public boolean getToggleCheckBox() {
        return AnonymousClass8BR.A1C(this.A03, this.A00).A0K;
    }

    public void setTextEntered(boolean z) {
        AnonymousClass8BR.A1C(this.A03, this.A00).A0L = z;
    }

    public void setToggleCheckBox(boolean z) {
        AnonymousClass8BR.A1C(this.A03, this.A00).A0K = z;
    }
}
