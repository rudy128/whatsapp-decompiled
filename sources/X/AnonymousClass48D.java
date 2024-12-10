package X;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.48D  reason: invalid class name */
public final class AnonymousClass48D extends C89564cf {
    public int A00;
    public C72763Nk[] A01 = new C72763Nk[0];
    public final /* synthetic */ C92954iC A02;
    public final /* synthetic */ AnonymousClass3UN A03;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        List<C446124c> list;
        C18070vi.A0d(charSequence, 0);
        if (i2 > 0) {
            C92954iC r0 = this.A02;
            C72763Nk[] r8 = this.A01;
            C18070vi.A0d(r8, 0);
            Editable text = r0.A05.getText();
            if (text != null) {
                for (C72763Nk r02 : r8) {
                    int spanStart = text.getSpanStart(r02);
                    int spanEnd = text.getSpanEnd(r02);
                    text.removeSpan(r02);
                    Integer[] numArr = new Integer[2];
                    C17880vN.A1T(numArr, spanStart, 0);
                    AnonymousClass000.A1M(numArr, spanEnd);
                    if (!C200410p.A0S(numArr).contains(-1)) {
                        text.delete(spanStart, spanEnd);
                    }
                }
            }
        }
        AnonymousClass3UN r7 = this.A03;
        MentionableEntry mentionableEntry = this.A02.A05;
        UserJid botMention = mentionableEntry.getBotMention();
        if (!C18070vi.A18(botMention, r7.A01)) {
            r7.A01 = botMention;
            AnonymousClass10I r1 = r7.A06;
            Runnable runnable = r7.A07;
            r1.CEz(runnable);
            r1.CGF(runnable);
        }
        String obj = charSequence.toString();
        List list2 = r7.A02;
        ArrayList arrayList2 = null;
        if (list2 != null) {
            arrayList = AnonymousClass000.A13();
            for (Object next : list2) {
                String str = ((C446124c) next).A02;
                C18070vi.A0d(obj, 0);
                int A0B = AnonymousClass1YF.A0B(obj, '/', obj.length() - 1);
                if (A0B != -1) {
                    String substring = obj.substring(A0B + 1);
                    C18070vi.A0X(substring);
                    if (!substring.equals(str) && AnonymousClass1YE.A0A(str, substring, false)) {
                        arrayList.add(next);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        C41111vp r5 = r7.A05;
        AnonymousClass4YU r12 = (AnonymousClass4YU) r5.A06();
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = arrayList;
        }
        r5.A0F(new AnonymousClass4YU(r12.A00, r12.A01, arrayList2, r12.A03));
        String obj2 = charSequence.toString();
        int A0F = AnonymousClass1YF.A0F(obj2, "/", 0, false);
        if (A0F != -1 && (list = r7.A02) != null) {
            for (C446124c r03 : list) {
                String str2 = r03.A02;
                int length = str2.length();
                int i4 = A0F + length;
                C18070vi.A0d(obj2, 0);
                if (i4 <= obj2.length() - 1) {
                    String substring2 = obj2.substring(A0F, i4 + 1);
                    C18070vi.A0X(substring2);
                    if (substring2.equals(C17890vO.A0Z(str2, AnonymousClass000.A10(), '/'))) {
                        if (charSequence.length() != this.A00) {
                            this.A00 = charSequence.length();
                            int A002 = AnonymousClass3Ma.A00(AnonymousClass3MY.A04(mentionableEntry), 2130971981, 2131101293);
                            Editable text2 = mentionableEntry.getText();
                            if (text2 != null) {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append('/');
                                A10.append(str2);
                                int A0F2 = AnonymousClass1YF.A0F(text2, C17890vO.A0c(A10, ' '), 0, false);
                                if (A0F2 != -1) {
                                    text2.setSpan(new ForegroundColorSpan(A002), A0F2, length + A0F2 + 1, 33);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public AnonymousClass48D(C92954iC r2, AnonymousClass3UN r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionableEntry mentionableEntry = this.A02.A05;
        Object[] spans = mentionableEntry.getEditableText().getSpans(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd(), C72763Nk.class);
        C18070vi.A0X(spans);
        this.A01 = (C72763Nk[]) spans;
    }
}
