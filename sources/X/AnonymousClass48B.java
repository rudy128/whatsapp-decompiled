package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.conversation.CommentsBottomSheet;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onInput$2;
import com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.48B  reason: invalid class name */
public class AnonymousClass48B extends C89564cf {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass48B(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void afterTextChanged(Editable editable) {
        Object value;
        C88044Yc r1;
        String str;
        Object value2;
        C88044Yc r12;
        Editable editable2 = editable;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(editable, 0);
                String obj = editable.toString();
                CommentsBottomSheet commentsBottomSheet = (CommentsBottomSheet) this.A02;
                AnonymousClass3VA r4 = (AnonymousClass3VA) commentsBottomSheet.A0W.getValue();
                C18070vi.A0d(obj, 0);
                if (AnonymousClass1EG.A0H(obj)) {
                    AnonymousClass1G4 r3 = r4.A0Q;
                    do {
                        value2 = r3.getValue();
                        r12 = (C88044Yc) value2;
                    } while (!r3.BFK(value2, new C88044Yc(r12.A01, r12.A02, r12.A03, r12.A04, r12.A00, false)));
                } else {
                    AnonymousClass3MX.A1Q(new CommentsBottomSheetViewModel$onInput$2(r4, (C30391dr) null), C41561wd.A00(r4));
                    AnonymousClass1G4 r32 = r4.A0Q;
                    do {
                        value = r32.getValue();
                        r1 = (C88044Yc) value;
                    } while (!r32.BFK(value, new C88044Yc(r1.A01, r1.A02, r1.A03, r1.A04, r1.A00, true)));
                }
                C18030ve r9 = commentsBottomSheet.A0G;
                if (r9 != null) {
                    Context A14 = commentsBottomSheet.A14();
                    AnonymousClass1KW r8 = commentsBottomSheet.A0F;
                    if (r8 != null) {
                        AnonymousClass11C r7 = commentsBottomSheet.A07;
                        if (r7 != null) {
                            C18010vc r10 = commentsBottomSheet.A0I;
                            if (r10 != null) {
                                TextPaint paint = ((TextView) this.A01).getPaint();
                                if (commentsBottomSheet.A0E != null) {
                                    C26302CxJ.A0L(A14, editable2, paint, r7, r8, r9, r10, AnonymousClass1YL.A00(commentsBottomSheet.A1n(), 2130970892, 2131102330), AnonymousClass1YL.A00(commentsBottomSheet.A1n(), 2130970132, 2131101250), true);
                                    return;
                                }
                                str = "emojiRichFormatterStaticCaller";
                            } else {
                                str = "sharedPreferencesFactory";
                            }
                        } else {
                            str = "systemServices";
                        }
                    } else {
                        str = "emojiLoader";
                    }
                } else {
                    str = "abProps";
                }
                C18070vi.A11(str);
                throw null;
            case 1:
                ((View) this.A02).setEnabled(!AnonymousClass1EG.A0H(editable.toString()));
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (2 - this.A00 != 0) {
            super.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        WDSButton wDSButton = ((InteropComposeEnterInfoActivity) this.A02).A0D;
        if (wDSButton == null) {
            C18070vi.A11("createChatButton");
            throw null;
        } else {
            wDSButton.setEnabled(AnonymousClass000.A1Y(((C22821Di) this.A01).invoke(charSequence)));
        }
    }
}
