package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.labelitem.view.bottomsheet.NewLabelView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4ev  reason: invalid class name and case insensitive filesystem */
public class C90964ev implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90964ev(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        WDSButton wDSButton;
        WDSButton wDSButton2;
        switch (this.A00) {
            case 0:
                TextView textView2 = (TextView) this.A01;
                SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = (SecretCodeAuthenticationBottomSheet) this.A02;
                if (((keyEvent == null || keyEvent.getKeyCode() != 66) && i != textView2.getImeOptions()) || (wDSButton = secretCodeAuthenticationBottomSheet.A03) == null || !wDSButton.isEnabled() || (wDSButton2 = secretCodeAuthenticationBottomSheet.A03) == null) {
                    return true;
                }
                wDSButton2.callOnClick();
                return true;
            case 1:
                ExpressionsSearchView expressionsSearchView = (ExpressionsSearchView) this.A01;
                WaEditText waEditText = (WaEditText) this.A02;
                if (i != 3) {
                    return false;
                }
                ((ExpressionsSearchViewModel) expressionsSearchView.A0T.getValue()).A0U(AnonymousClass3MZ.A17(waEditText), true);
                waEditText.A0H();
                return false;
            default:
                AnonymousClass1OS r3 = (AnonymousClass1OS) this.A01;
                NewLabelView newLabelView = (NewLabelView) this.A02;
                CharSequence text = textView.getText();
                C18070vi.A0X(text);
                if (text.length() <= 0) {
                    return false;
                }
                if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
                    return false;
                }
                r3.invoke(Integer.valueOf(newLabelView.A00), AnonymousClass3MZ.A17(newLabelView.A0C));
                return false;
        }
    }
}
