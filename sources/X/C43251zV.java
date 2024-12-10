package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.widget.EditText;

/* renamed from: X.1zV  reason: invalid class name and case insensitive filesystem */
public abstract class C43251zV {
    public static boolean A00;

    public static CharSequence A02(Context context, Paint paint, C72243Le r9, AnonymousClass1KW r10, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        SpannableStringBuilder A002 = A00(context, paint, r9, r10, charSequence2, 1.0f);
        int BU0 = r9.BU0();
        if (BU0 != 0) {
            if (A002 == null) {
                A002 = new SpannableStringBuilder(charSequence);
            }
            SpannableStringBuilder delete = A002.delete(BU0 + (Character.charCount(Character.codePointAt(charSequence, BU0 - 1)) - 1), A002.length());
            delete.append("…");
            return delete;
        } else if (A002 != null) {
            return A002;
        } else {
            return charSequence2;
        }
    }

    public static CharSequence A03(Context context, Paint paint, AnonymousClass1KW r8, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder A002 = A00(context, paint, (C72243Le) null, r8, charSequence2, 1.0f);
        if (A002 != null) {
            return A002;
        }
        return charSequence2;
    }

    public static CharSequence A04(Context context, Paint paint, AnonymousClass1KW r7, CharSequence charSequence, float f) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder A002 = A00(context, paint, (C72243Le) null, r7, charSequence2, f);
        if (A002 != null) {
            return A002;
        }
        return charSequence2;
    }

    public static String A06(int[] iArr) {
        StringBuilder sb = new StringBuilder(r3);
        for (int chars : iArr) {
            sb.append(Character.toChars(chars));
        }
        return sb.toString();
    }

    public static SpannableStringBuilder A00(Context context, Paint paint, C72243Le r5, AnonymousClass1KW r6, CharSequence charSequence, float f) {
        C43261zW r0;
        if (paint == null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169432);
            Paint paint2 = new Paint();
            paint2.setTextSize((float) dimensionPixelSize);
            r0 = new C43261zW(paint2, 1.0f);
        } else {
            r0 = new C43261zW(paint, f);
        }
        return A01(context, r5, r0, r6, charSequence);
    }

    public static SpannableStringBuilder A01(Context context, C72243Le r18, C43261zW r19, AnonymousClass1KW r20, CharSequence charSequence) {
        boolean C8B;
        float f;
        Object imageSpan;
        CharSequence charSequence2 = charSequence;
        C43281zY r9 = new C43281zY(charSequence2);
        int length = charSequence2.length();
        Paint paint = new Paint();
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < length) {
                r9.A00 = i;
                long A002 = C43291zZ.A00(r9, false);
                int A02 = r9.A02(A002, i);
                C72243Le r11 = r18;
                if (A002 != -1) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(charSequence2);
                    }
                    Context context2 = context;
                    BitmapDrawable A07 = r20.A07(context2.getResources(), r9, A002);
                    if (A07 != null) {
                        CharSequence subSequence = spannableStringBuilder.subSequence(i2, i2 + A02);
                        C43261zW r14 = r19;
                        Paint paint2 = r14.A01;
                        Paint.FontMetricsInt A003 = C43431zn.A00(paint2);
                        if (A003 != null) {
                            int textSize = (int) ((r14.A00 * paint2.getTextSize() * 1.1f) + 0.5f);
                            A07.setBounds(0, 0, textSize, textSize);
                            imageSpan = new AnonymousClass48p(context2, A003, A07, subSequence);
                        } else {
                            if (paint2.getFontMetrics() != null) {
                                f = (r14.A00 * paint2.getTextSize() * 1.1f) + 0.5f;
                            } else {
                                f = context2.getResources().getDisplayMetrics().scaledDensity * 22.0f;
                            }
                            int i3 = (int) f;
                            A07.setBounds(0, 0, i3, i3);
                            imageSpan = new ImageSpan(A07, 0);
                        }
                        spannableStringBuilder.setSpan(imageSpan, i2, i2 + A02, 33);
                        if (r18 != null) {
                            C8B = r11.C8B(i, true);
                        } else {
                            continue;
                        }
                    } else if (!C25898Co9.A01(paint, charSequence2.subSequence(i, i + A02).toString())) {
                        spannableStringBuilder.setSpan(new ReplacementSpan(), i2, i2 + A02, 33);
                    }
                    i2 += A02;
                    i += A02;
                } else if (r18 != null) {
                    C8B = r11.C8B(i, false);
                } else {
                    continue;
                    i2 += A02;
                    i += A02;
                }
                if (!C8B) {
                    break;
                }
                i2 += A02;
                i += A02;
            } else if (charSequence2 instanceof SpannableStringBuilder) {
                return (SpannableStringBuilder) charSequence2;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence A05(Context context, AnonymousClass1KW r4, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169432);
        Paint paint = new Paint();
        paint.setTextSize((float) dimensionPixelSize);
        SpannableStringBuilder A01 = A01(context, (C72243Le) null, new C43261zW(paint, 1.0f), r4, charSequence);
        if (A01 != null) {
            return A01;
        }
        return charSequence;
    }

    public static void A08(Context context, Paint paint, Editable editable, AnonymousClass1KW r15, C18030ve r16, float f) {
        boolean z;
        Object imageSpan;
        Paint.FontMetricsInt A002;
        if (!A00) {
            A00 = true;
            C18030ve r2 = r16;
            if (r16 != null) {
                z = C18020vd.A05(C18040vf.A01, r2, 11010);
            } else {
                z = false;
            }
            String obj = editable.toString();
            if (!z) {
                for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, obj.length(), ImageSpan.class)) {
                    if (!(imageSpan2.getDrawable() instanceof C23518Bih)) {
                        editable.removeSpan(imageSpan2);
                    }
                }
            }
            C43281zY r4 = new C43281zY(obj);
            int length = obj.length();
            int i = 0;
            while (i < length) {
                r4.A00 = i;
                long A003 = C43291zZ.A00(r4, false);
                int A02 = r4.A02(A003, i);
                if (A003 != -1) {
                    int i2 = i + A02;
                    if (z) {
                        ImageSpan[] imageSpanArr = (ImageSpan[]) editable.getSpans(i, i2, ImageSpan.class);
                        if (imageSpanArr.length != 0 && (imageSpanArr[0] instanceof AnonymousClass48p)) {
                        }
                    }
                    BitmapDrawable A07 = r15.A07(context.getResources(), r4, A003);
                    if (A07 != null) {
                        if (paint == null || (A002 = C43431zn.A00(paint)) == null) {
                            A07.setBounds(0, 0, (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f), (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f));
                            imageSpan = new ImageSpan(A07, 0);
                        } else {
                            int textSize = (int) ((paint.getTextSize() * f) + 0.5f);
                            A07.setBounds(0, 0, textSize, textSize);
                            imageSpan = new AnonymousClass48p(context, A002, A07, obj.substring(i, i + A02));
                        }
                        editable.setSpan(imageSpan, i, i + A02, 33);
                    }
                }
                i += A02;
            }
            A00 = false;
        }
    }

    public static void A07(Context context, Paint paint, Editable editable, AnonymousClass1KW r9, C18030ve r10) {
        A08(context, paint, editable, r9, r10, 1.3f);
    }

    public static void A09(EditText editText, int[] iArr, int i) {
        int max = Math.max(0, editText.getSelectionStart());
        int max2 = Math.max(0, editText.getSelectionEnd());
        if (max > max2) {
            int i2 = max2;
            max2 = max;
            max = i2;
        }
        if (i > 0) {
            StringBuilder sb = new StringBuilder(editText.getText().toString());
            sb.replace(max, max2, A06(iArr));
            if (C137186v3.A00(sb) > i) {
                return;
            }
        }
        editText.getText().replace(max, max2, A06(iArr));
        int i3 = 0;
        for (int charCount : iArr) {
            i3 += Character.charCount(charCount);
        }
        if (max <= editText.length() - i3) {
            editText.setSelection(max + i3);
        }
    }
}
