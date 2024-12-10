package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Cw9  reason: case insensitive filesystem */
public class C26264Cw9 {
    public static SparseIntArray A02;
    public static final int[] A03 = {0, 4, 8};
    public HashMap A00 = C17880vN.A11();
    public HashMap A01 = C17880vN.A11();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A02 = sparseIntArray;
        A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(sparseIntArray, 76, 25), 77, 26), 79, 29), 80, 30), 86, 36), 85, 35), 58, 4), 57, 3), 55, 1), 94, 6), 95, 7), 65, 17), 66, 18), 67, 19), 0, 27), 81, 32), 82, 33), 64, 10), 63, 9), 98, 13), 101, 16), 99, 14), 96, 11), 100, 15), 97, 12), 89, 40), 74, 39), 73, 41), 88, 42), 72, 20), 87, 37), 62, 5), 75, 82), 84, 82), 78, 82), 56, 82), 54, 82), 5, 24), 7, 28), 23, 31), 24, 8), 6, 34), 8, 2), 3, 23), 4, 21), 2, 22), 13, 43), 26, 44), 21, 45), 22, 46), 20, 60), 18, 47), 19, 48), 14, 49), 15, 50), 16, 51), 17, 52), 25, 53), 90, 54), 68, 55), 91, 56), 69, 57), 92, 58), 70, 59), 59, 61), 61, 62), 60, 63), 27, 64), 106, 65), 33, 66), 107, 67), 103, 79), 1, 38), 102, 68), 93, 69), 71, 70), 31, 71), 29, 72), 30, 73), 32, 74), 28, 75), 104, 76), 83, 77), AnonymousClass74N.A03, 78), 53, 80).append(52, 81);
    }

    public void A08(int i) {
        A03(this, i).A02.A03 = 0.0f;
    }

    public static CZ8 A02(Context context, AttributeSet attributeSet) {
        StringBuilder A10;
        String str;
        String str2;
        CZ8 cz8 = new CZ8();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39121sW.A00);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (!(index == 1 || 23 == index || 24 == index)) {
                cz8.A03.A06 = true;
                cz8.A02.A0w = true;
                cz8.A04.A04 = true;
                cz8.A05.A0C = true;
            }
            SparseIntArray sparseIntArray = A02;
            switch (sparseIntArray.get(index)) {
                case 1:
                    C25966CpY cpY = cz8.A02;
                    cpY.A08 = A00(obtainStyledAttributes, index, cpY.A08);
                    continue;
                case 2:
                    C25966CpY cpY2 = cz8.A02;
                    cpY2.A09 = obtainStyledAttributes.getDimensionPixelSize(index, cpY2.A09);
                    continue;
                case 3:
                    C25966CpY cpY3 = cz8.A02;
                    cpY3.A0A = A00(obtainStyledAttributes, index, cpY3.A0A);
                    continue;
                case 4:
                    C25966CpY cpY4 = cz8.A02;
                    cpY4.A0B = A00(obtainStyledAttributes, index, cpY4.A0B);
                    continue;
                case 5:
                    cz8.A02.A0r = obtainStyledAttributes.getString(index);
                    continue;
                case 6:
                    C25966CpY cpY5 = cz8.A02;
                    cpY5.A0E = obtainStyledAttributes.getDimensionPixelOffset(index, cpY5.A0E);
                    continue;
                case 7:
                    C25966CpY cpY6 = cz8.A02;
                    cpY6.A0F = obtainStyledAttributes.getDimensionPixelOffset(index, cpY6.A0F);
                    continue;
                case 8:
                    C25966CpY cpY7 = cz8.A02;
                    cpY7.A0G = obtainStyledAttributes.getDimensionPixelSize(index, cpY7.A0G);
                    continue;
                case 9:
                    C25966CpY cpY8 = cz8.A02;
                    cpY8.A0H = A00(obtainStyledAttributes, index, cpY8.A0H);
                    continue;
                case 10:
                    C25966CpY cpY9 = cz8.A02;
                    cpY9.A0I = A00(obtainStyledAttributes, index, cpY9.A0I);
                    continue;
                case 11:
                    C25966CpY cpY10 = cz8.A02;
                    cpY10.A0J = obtainStyledAttributes.getDimensionPixelSize(index, cpY10.A0J);
                    continue;
                case 12:
                    C25966CpY cpY11 = cz8.A02;
                    cpY11.A0K = obtainStyledAttributes.getDimensionPixelSize(index, cpY11.A0K);
                    continue;
                case 13:
                    C25966CpY cpY12 = cz8.A02;
                    cpY12.A0L = obtainStyledAttributes.getDimensionPixelSize(index, cpY12.A0L);
                    continue;
                case 14:
                    C25966CpY cpY13 = cz8.A02;
                    cpY13.A0M = obtainStyledAttributes.getDimensionPixelSize(index, cpY13.A0M);
                    continue;
                case 15:
                    C25966CpY cpY14 = cz8.A02;
                    cpY14.A0N = obtainStyledAttributes.getDimensionPixelSize(index, cpY14.A0N);
                    continue;
                case 16:
                    C25966CpY cpY15 = cz8.A02;
                    cpY15.A0O = obtainStyledAttributes.getDimensionPixelSize(index, cpY15.A0O);
                    continue;
                case 17:
                    C25966CpY cpY16 = cz8.A02;
                    cpY16.A0P = obtainStyledAttributes.getDimensionPixelOffset(index, cpY16.A0P);
                    continue;
                case 18:
                    C25966CpY cpY17 = cz8.A02;
                    cpY17.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, cpY17.A0Q);
                    continue;
                case 19:
                    C25966CpY cpY18 = cz8.A02;
                    cpY18.A01 = obtainStyledAttributes.getFloat(index, cpY18.A01);
                    continue;
                case 20:
                    C25966CpY cpY19 = cz8.A02;
                    cpY19.A03 = obtainStyledAttributes.getFloat(index, cpY19.A03);
                    continue;
                case 21:
                    C25966CpY cpY20 = cz8.A02;
                    cpY20.A0a = obtainStyledAttributes.getLayoutDimension(index, cpY20.A0a);
                    continue;
                case 22:
                    CS4 cs4 = cz8.A04;
                    int i2 = obtainStyledAttributes.getInt(index, cs4.A03);
                    cs4.A03 = i2;
                    cs4.A03 = A03[i2];
                    continue;
                case 23:
                    C25966CpY cpY21 = cz8.A02;
                    cpY21.A0c = obtainStyledAttributes.getLayoutDimension(index, cpY21.A0c);
                    continue;
                case 24:
                    C25966CpY cpY22 = cz8.A02;
                    cpY22.A0V = obtainStyledAttributes.getDimensionPixelSize(index, cpY22.A0V);
                    continue;
                case 25:
                    C25966CpY cpY23 = cz8.A02;
                    cpY23.A0W = A00(obtainStyledAttributes, index, cpY23.A0W);
                    continue;
                case 26:
                    C25966CpY cpY24 = cz8.A02;
                    cpY24.A0X = A00(obtainStyledAttributes, index, cpY24.A0X);
                    continue;
                case 27:
                    C25966CpY cpY25 = cz8.A02;
                    cpY25.A0d = obtainStyledAttributes.getInt(index, cpY25.A0d);
                    continue;
                case 28:
                    C25966CpY cpY26 = cz8.A02;
                    cpY26.A0e = obtainStyledAttributes.getDimensionPixelSize(index, cpY26.A0e);
                    continue;
                case 29:
                    C25966CpY cpY27 = cz8.A02;
                    cpY27.A0f = A00(obtainStyledAttributes, index, cpY27.A0f);
                    continue;
                case 30:
                    C25966CpY cpY28 = cz8.A02;
                    cpY28.A0g = A00(obtainStyledAttributes, index, cpY28.A0g);
                    continue;
                case 31:
                    C25966CpY cpY29 = cz8.A02;
                    cpY29.A0h = obtainStyledAttributes.getDimensionPixelSize(index, cpY29.A0h);
                    continue;
                case 32:
                    C25966CpY cpY30 = cz8.A02;
                    cpY30.A0i = A00(obtainStyledAttributes, index, cpY30.A0i);
                    continue;
                case 33:
                    C25966CpY cpY31 = cz8.A02;
                    cpY31.A0j = A00(obtainStyledAttributes, index, cpY31.A0j);
                    continue;
                case 34:
                    C25966CpY cpY32 = cz8.A02;
                    cpY32.A0k = obtainStyledAttributes.getDimensionPixelSize(index, cpY32.A0k);
                    continue;
                case 35:
                    C25966CpY cpY33 = cz8.A02;
                    cpY33.A0l = A00(obtainStyledAttributes, index, cpY33.A0l);
                    continue;
                case 36:
                    C25966CpY cpY34 = cz8.A02;
                    cpY34.A0m = A00(obtainStyledAttributes, index, cpY34.A0m);
                    continue;
                case 37:
                    C25966CpY cpY35 = cz8.A02;
                    cpY35.A05 = obtainStyledAttributes.getFloat(index, cpY35.A05);
                    continue;
                case 38:
                    cz8.A00 = obtainStyledAttributes.getResourceId(index, cz8.A00);
                    continue;
                case 39:
                    C25966CpY cpY36 = cz8.A02;
                    cpY36.A04 = obtainStyledAttributes.getFloat(index, cpY36.A04);
                    continue;
                case 40:
                    C25966CpY cpY37 = cz8.A02;
                    cpY37.A06 = obtainStyledAttributes.getFloat(index, cpY37.A06);
                    continue;
                case 41:
                    C25966CpY cpY38 = cz8.A02;
                    cpY38.A0U = obtainStyledAttributes.getInt(index, cpY38.A0U);
                    continue;
                case 42:
                    C25966CpY cpY39 = cz8.A02;
                    cpY39.A0n = obtainStyledAttributes.getInt(index, cpY39.A0n);
                    continue;
                case 43:
                    CS4 cs42 = cz8.A04;
                    cs42.A00 = obtainStyledAttributes.getFloat(index, cs42.A00);
                    continue;
                case 44:
                    C25620Cj0 cj0 = cz8.A05;
                    cj0.A0B = true;
                    cj0.A00 = obtainStyledAttributes.getDimension(index, cj0.A00);
                    continue;
                case 45:
                    C25620Cj0 cj02 = cz8.A05;
                    cj02.A02 = obtainStyledAttributes.getFloat(index, cj02.A02);
                    continue;
                case 46:
                    C25620Cj0 cj03 = cz8.A05;
                    cj03.A03 = obtainStyledAttributes.getFloat(index, cj03.A03);
                    continue;
                case 47:
                    C25620Cj0 cj04 = cz8.A05;
                    cj04.A04 = obtainStyledAttributes.getFloat(index, cj04.A04);
                    continue;
                case 48:
                    C25620Cj0 cj05 = cz8.A05;
                    cj05.A05 = obtainStyledAttributes.getFloat(index, cj05.A05);
                    continue;
                case 49:
                    C25620Cj0 cj06 = cz8.A05;
                    cj06.A06 = obtainStyledAttributes.getDimension(index, cj06.A06);
                    continue;
                case 50:
                    C25620Cj0 cj07 = cz8.A05;
                    cj07.A07 = obtainStyledAttributes.getDimension(index, cj07.A07);
                    continue;
                case 51:
                    C25620Cj0 cj08 = cz8.A05;
                    cj08.A08 = obtainStyledAttributes.getDimension(index, cj08.A08);
                    continue;
                case 52:
                    C25620Cj0 cj09 = cz8.A05;
                    cj09.A09 = obtainStyledAttributes.getDimension(index, cj09.A09);
                    continue;
                case 53:
                    C25620Cj0 cj010 = cz8.A05;
                    cj010.A0A = obtainStyledAttributes.getDimension(index, cj010.A0A);
                    continue;
                case 54:
                    C25966CpY cpY40 = cz8.A02;
                    cpY40.A0o = obtainStyledAttributes.getInt(index, cpY40.A0o);
                    continue;
                case 55:
                    C25966CpY cpY41 = cz8.A02;
                    cpY41.A0R = obtainStyledAttributes.getInt(index, cpY41.A0R);
                    continue;
                case 56:
                    C25966CpY cpY42 = cz8.A02;
                    cpY42.A0p = obtainStyledAttributes.getDimensionPixelSize(index, cpY42.A0p);
                    continue;
                case 57:
                    C25966CpY cpY43 = cz8.A02;
                    cpY43.A0S = obtainStyledAttributes.getDimensionPixelSize(index, cpY43.A0S);
                    continue;
                case 58:
                    C25966CpY cpY44 = cz8.A02;
                    cpY44.A0q = obtainStyledAttributes.getDimensionPixelSize(index, cpY44.A0q);
                    continue;
                case 59:
                    C25966CpY cpY45 = cz8.A02;
                    cpY45.A0T = obtainStyledAttributes.getDimensionPixelSize(index, cpY45.A0T);
                    continue;
                case 60:
                    C25620Cj0 cj011 = cz8.A05;
                    cj011.A01 = obtainStyledAttributes.getFloat(index, cj011.A01);
                    continue;
                case 61:
                    C25966CpY cpY46 = cz8.A02;
                    cpY46.A0C = A00(obtainStyledAttributes, index, cpY46.A0C);
                    continue;
                case 62:
                    C25966CpY cpY47 = cz8.A02;
                    cpY47.A0D = obtainStyledAttributes.getDimensionPixelSize(index, cpY47.A0D);
                    continue;
                case 63:
                    C25966CpY cpY48 = cz8.A02;
                    cpY48.A00 = obtainStyledAttributes.getFloat(index, cpY48.A00);
                    continue;
                case 64:
                    C25605Cik cik = cz8.A03;
                    cik.A02 = A00(obtainStyledAttributes, index, cik.A02);
                    continue;
                case 65:
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    C25605Cik cik2 = cz8.A03;
                    if (i3 == 3) {
                        str2 = obtainStyledAttributes.getString(index);
                    } else {
                        str2 = CEB.A00[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    cik2.A05 = str2;
                    continue;
                case 66:
                    cz8.A03.A03 = obtainStyledAttributes.getInt(index, 0);
                    continue;
                case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                    C25605Cik cik3 = cz8.A03;
                    cik3.A01 = obtainStyledAttributes.getFloat(index, cik3.A01);
                    continue;
                case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                    CS4 cs43 = cz8.A04;
                    cs43.A01 = obtainStyledAttributes.getFloat(index, cs43.A01);
                    continue;
                case 69:
                    cz8.A02.A07 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 70:
                    cz8.A02.A02 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    C25966CpY cpY49 = cz8.A02;
                    cpY49.A0Y = obtainStyledAttributes.getInt(index, cpY49.A0Y);
                    continue;
                case 73:
                    C25966CpY cpY50 = cz8.A02;
                    cpY50.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, cpY50.A0Z);
                    continue;
                case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                    cz8.A02.A0t = obtainStyledAttributes.getString(index);
                    continue;
                case C166418cr.EVENT_MESSAGE_FIELD_NUMBER:
                    C25966CpY cpY51 = cz8.A02;
                    cpY51.A0x = obtainStyledAttributes.getBoolean(index, cpY51.A0x);
                    continue;
                case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER:
                    C25605Cik cik4 = cz8.A03;
                    cik4.A04 = obtainStyledAttributes.getInt(index, cik4.A04);
                    continue;
                case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER:
                    cz8.A02.A0s = obtainStyledAttributes.getString(index);
                    continue;
                case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
                    CS4 cs44 = cz8.A04;
                    cs44.A02 = obtainStyledAttributes.getInt(index, cs44.A02);
                    continue;
                case 79:
                    C25605Cik cik5 = cz8.A03;
                    cik5.A00 = obtainStyledAttributes.getFloat(index, cik5.A00);
                    continue;
                case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER:
                    C25966CpY cpY52 = cz8.A02;
                    cpY52.A0v = obtainStyledAttributes.getBoolean(index, cpY52.A0v);
                    continue;
                case 81:
                    C25966CpY cpY53 = cz8.A02;
                    cpY53.A0u = obtainStyledAttributes.getBoolean(index, cpY53.A0u);
                    continue;
                case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER:
                    A10 = AnonymousClass000.A10();
                    str = "unused attribute 0x";
                    break;
                default:
                    A10 = AnonymousClass000.A10();
                    str = "Unknown attribute 0x";
                    break;
            }
            BE9.A1J(str, A10, index);
            A10.append("   ");
            Log.w("ConstraintSet", C17880vN.A0t(A10, sparseIntArray.get(index)));
        }
        obtainStyledAttributes.recycle();
        return cz8;
    }

    public static CZ8 A03(C26264Cw9 cw9, int i) {
        HashMap hashMap = cw9.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new CZ8());
        }
        return (CZ8) hashMap.get(valueOf);
    }

    public static int[] A05(View view, String str) {
        int i;
        Object obj;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int length = split.length;
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String trim = split[i2].trim();
            try {
                i = AnonymousClass2SI.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, PublicKeyCredentialControllerUtility.JSON_KEY_ID, context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                if (trim == null || (hashMap = constraintLayout.A0C) == null || !hashMap.containsKey(trim)) {
                    obj = null;
                } else {
                    obj = constraintLayout.A0C.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = AnonymousClass000.A0M(obj);
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    public void A06(int i) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            C25966CpY cpY = ((CZ8) hashMap.get(valueOf)).A02;
            cpY.A0B = -1;
            cpY.A0A = -1;
            cpY.A09 = -1;
            cpY.A0J = -1;
        }
    }

    public void A09(int i, int i2, int i3, int i4) {
        C25966CpY cpY;
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new CZ8());
        }
        CZ8 cz8 = (CZ8) hashMap.get(valueOf);
        switch (i2) {
            case 3:
                if (i4 == 3) {
                    cpY = cz8.A02;
                    cpY.A0m = i3;
                    cpY.A0l = -1;
                    break;
                } else if (i4 == 4) {
                    cpY = cz8.A02;
                    cpY.A0l = i3;
                    cpY.A0m = -1;
                    break;
                } else {
                    StringBuilder A11 = AnonymousClass000.A11("right to ");
                    A11.append(A04(i4));
                    throw AnonymousClass001.A12(" undefined", A11);
                }
            case 4:
                if (i4 == 4) {
                    cpY = cz8.A02;
                    cpY.A0A = i3;
                    cpY.A0B = -1;
                    break;
                } else if (i4 == 3) {
                    cpY = cz8.A02;
                    cpY.A0B = i3;
                    cpY.A0A = -1;
                    break;
                } else {
                    StringBuilder A112 = AnonymousClass000.A11("right to ");
                    A112.append(A04(i4));
                    throw AnonymousClass001.A12(" undefined", A112);
                }
            case 5:
                if (i4 == 5) {
                    C25966CpY cpY2 = cz8.A02;
                    cpY2.A08 = i3;
                    cpY2.A0A = -1;
                    cpY2.A0B = -1;
                    cpY2.A0m = -1;
                    cpY2.A0l = -1;
                    return;
                }
                StringBuilder A113 = AnonymousClass000.A11("right to ");
                A113.append(A04(i4));
                throw AnonymousClass001.A12(" undefined", A113);
            case 6:
                if (i4 == 6) {
                    C25966CpY cpY3 = cz8.A02;
                    cpY3.A0j = i3;
                    cpY3.A0i = -1;
                    return;
                } else if (i4 == 7) {
                    C25966CpY cpY4 = cz8.A02;
                    cpY4.A0i = i3;
                    cpY4.A0j = -1;
                    return;
                } else {
                    StringBuilder A114 = AnonymousClass000.A11("right to ");
                    A114.append(A04(i4));
                    throw AnonymousClass001.A12(" undefined", A114);
                }
            default:
                if (i4 == 7) {
                    C25966CpY cpY5 = cz8.A02;
                    cpY5.A0H = i3;
                    cpY5.A0I = -1;
                    return;
                } else if (i4 == 6) {
                    C25966CpY cpY6 = cz8.A02;
                    cpY6.A0I = i3;
                    cpY6.A0H = -1;
                    return;
                } else {
                    StringBuilder A115 = AnonymousClass000.A11("right to ");
                    A115.append(A04(i4));
                    throw AnonymousClass001.A12(" undefined", A115);
                }
        }
        cpY.A08 = -1;
    }

    public void A0B(ConstraintLayout constraintLayout) {
        Method method;
        Object[] objArr;
        String str;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap = this.A00;
        HashSet A12 = AnonymousClass8BR.A12(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout2.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("id unknown ");
                try {
                    str = AnonymousClass000.A0Y(childAt).getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                BE9.A1H(str, "ConstraintSet", A10);
            } else if (id == -1) {
                throw AnonymousClass8BR.A0w("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    Integer valueOf = Integer.valueOf(id);
                    A12.remove(valueOf);
                    CZ8 cz8 = (CZ8) hashMap.get(valueOf);
                    if (childAt instanceof Barrier) {
                        cz8.A02.A0b = 1;
                    }
                    C25966CpY cpY = cz8.A02;
                    int i2 = cpY.A0b;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.A00 = cpY.A0Y;
                        barrier.setMargin(cpY.A0Z);
                        barrier.setAllowsGoneWidget(cpY.A0x);
                        int[] iArr = cpY.A0z;
                        if (iArr == null) {
                            String str2 = cpY.A0t;
                            if (str2 != null) {
                                iArr = A05(barrier, str2);
                                cpY.A0z = iArr;
                            }
                        }
                        barrier.setReferencedIds(iArr);
                    }
                    C39151sZ r10 = (C39151sZ) childAt.getLayoutParams();
                    r10.A00();
                    cz8.A00(r10);
                    HashMap hashMap2 = cz8.A01;
                    Class<?> cls = childAt.getClass();
                    Iterator A0k = C17890vO.A0k(hashMap2);
                    while (A0k.hasNext()) {
                        String A0v = C17880vN.A0v(A0k);
                        C66 c66 = (C66) hashMap2.get(A0v);
                        String A1H = AnonymousClass001.A1H("set", A0v, AnonymousClass000.A10());
                        try {
                            switch (c66.A03.intValue()) {
                                case 0:
                                    method = BE9.A0v(cls, A1H);
                                    objArr = new Object[1];
                                    C17880vN.A1T(objArr, c66.A02, 0);
                                    break;
                                case 1:
                                    method = BE6.A0x(cls, Float.TYPE, A1H, new Class[1], 0);
                                    objArr = new Object[1];
                                    BE6.A1T(objArr, c66.A00, 0);
                                    break;
                                case 2:
                                    method = BE9.A0v(cls, A1H);
                                    objArr = new Object[1];
                                    C17880vN.A1T(objArr, c66.A01, 0);
                                    break;
                                case 3:
                                    Method A0x = BE6.A0x(cls, Drawable.class, A1H, new Class[1], 0);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(c66.A01);
                                    A0x.invoke(childAt, new Object[]{colorDrawable});
                                    break;
                                case 4:
                                    method = BE6.A0x(cls, CharSequence.class, A1H, new Class[1], 0);
                                    objArr = new Object[]{c66.A05};
                                    break;
                                case 5:
                                    method = BE6.A0x(cls, Boolean.TYPE, A1H, new Class[1], 0);
                                    objArr = new Object[1];
                                    AnonymousClass8BR.A1L(objArr, 0, c66.A06);
                                    break;
                                case 6:
                                    method = BE6.A0x(cls, Float.TYPE, A1H, new Class[1], 0);
                                    objArr = new Object[1];
                                    BE6.A1T(objArr, c66.A00, 0);
                                    break;
                            }
                            method.invoke(childAt, objArr);
                        } catch (NoSuchMethodException e) {
                            Log.e("TransitionLayout", e.getMessage());
                            StringBuilder A0H = C17900vP.A0H(" Custom Attribute \"", A0v, "\" not found on ");
                            String name = cls.getName();
                            Log.e("TransitionLayout", AnonymousClass000.A0y(name, A0H));
                            Log.e("TransitionLayout", AnonymousClass001.A1H(" must have a method ", A1H, AnonymousClass000.A11(name)));
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.e("TransitionLayout", AnonymousClass000.A0y(cls.getName(), C17900vP.A0H(" Custom Attribute \"", A0v, "\" not found on ")));
                            e2.printStackTrace();
                        }
                    }
                    childAt.setLayoutParams(r10);
                    CS4 cs4 = cz8.A04;
                    if (cs4.A02 == 0) {
                        childAt.setVisibility(cs4.A03);
                    }
                    childAt.setAlpha(cs4.A00);
                    C25620Cj0 cj0 = cz8.A05;
                    childAt.setRotation(cj0.A01);
                    childAt.setRotationX(cj0.A02);
                    childAt.setRotationY(cj0.A03);
                    childAt.setScaleX(cj0.A04);
                    childAt.setScaleY(cj0.A05);
                    float f = cj0.A06;
                    if (!Float.isNaN(f)) {
                        childAt.setPivotX(f);
                    }
                    float f2 = cj0.A07;
                    if (!Float.isNaN(f2)) {
                        childAt.setPivotY(f2);
                    }
                    childAt.setTranslationX(cj0.A08);
                    childAt.setTranslationY(cj0.A09);
                    childAt.setTranslationZ(cj0.A0A);
                    if (cj0.A0B) {
                        childAt.setElevation(cj0.A00);
                    }
                } else {
                    Log.v("ConstraintSet", AnonymousClass001.A1I("WARNING NO CONSTRAINTS for view ", AnonymousClass000.A10(), id));
                }
            }
        }
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            CZ8 cz82 = (CZ8) hashMap.get(number);
            C25966CpY cpY2 = cz82.A02;
            int i3 = cpY2.A0b;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout2.getContext());
                barrier2.setId(number.intValue());
                int[] iArr2 = cpY2.A0z;
                if (iArr2 == null) {
                    String str3 = cpY2.A0t;
                    if (str3 != null) {
                        iArr2 = A05(barrier2, str3);
                        cpY2.A0z = iArr2;
                    }
                    barrier2.A00 = cpY2.A0Y;
                    barrier2.setMargin(cpY2.A0Z);
                    C39151sZ r1 = new C39151sZ(-2, -2);
                    barrier2.A04();
                    cz82.A00(r1);
                    constraintLayout2.addView(barrier2, r1);
                }
                barrier2.setReferencedIds(iArr2);
                barrier2.A00 = cpY2.A0Y;
                barrier2.setMargin(cpY2.A0Z);
                C39151sZ r12 = new C39151sZ(-2, -2);
                barrier2.A04();
                cz82.A00(r12);
                constraintLayout2.addView(barrier2, r12);
            }
            if (cpY2.A0y) {
                Guideline guideline = new Guideline(constraintLayout2.getContext());
                guideline.setId(number.intValue());
                C39151sZ r13 = new C39151sZ(-2, -2);
                cz82.A00(r13);
                constraintLayout2.addView(guideline, r13);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.C66, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.C66, java.lang.Object] */
    public void A0C(ConstraintLayout constraintLayout) {
        Object A0V;
        C66 c66;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap = this.A00;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout2.getChildAt(i);
            C39151sZ r8 = (C39151sZ) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new CZ8());
                }
                CZ8 cz8 = (CZ8) AnonymousClass8BT.A0r(hashMap, id);
                HashMap hashMap2 = this.A01;
                HashMap A11 = C17880vN.A11();
                Class<?> cls = childAt.getClass();
                Iterator A0k = C17890vO.A0k(hashMap2);
                while (A0k.hasNext()) {
                    String A0v = C17880vN.A0v(A0k);
                    C66 c662 = (C66) hashMap2.get(A0v);
                    try {
                        if (A0v.equals("BackgroundColor")) {
                            A0V = Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor());
                            ? obj = new Object();
                            obj.A04 = c662.A04;
                            obj.A03 = c662.A03;
                            c66 = obj;
                        } else {
                            A0V = C108995ce.A0V(cls, childAt, AnonymousClass001.A1H("getMap", A0v, AnonymousClass000.A10()));
                            ? obj2 = new Object();
                            obj2.A04 = c662.A04;
                            obj2.A03 = c662.A03;
                            c66 = obj2;
                        }
                        c66.A00(A0V);
                        A11.put(A0v, c66);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
                cz8.A01 = A11;
                cz8.A00 = id;
                C25966CpY cpY = cz8.A02;
                cpY.A0W = r8.A0T;
                cpY.A0X = r8.A0U;
                cpY.A0f = r8.A0k;
                cpY.A0g = r8.A0l;
                cpY.A0m = r8.A0p;
                cpY.A0l = r8.A0o;
                cpY.A0B = r8.A0C;
                cpY.A0A = r8.A0B;
                cpY.A08 = r8.A0A;
                cpY.A0i = r8.A0m;
                cpY.A0j = r8.A0n;
                cpY.A0I = r8.A0J;
                cpY.A0H = r8.A0I;
                cpY.A03 = r8.A02;
                cpY.A05 = r8.A08;
                cpY.A0r = r8.A0t;
                cpY.A0C = r8.A0D;
                cpY.A0D = r8.A0E;
                cpY.A00 = r8.A00;
                cpY.A0E = r8.A0G;
                cpY.A0F = r8.A0H;
                cpY.A0d = r8.A0b;
                cpY.A01 = r8.A01;
                cpY.A0P = r8.A0Q;
                cpY.A0Q = r8.A0R;
                cpY.A0c = r8.width;
                cpY.A0a = r8.height;
                cpY.A0V = r8.leftMargin;
                cpY.A0e = r8.rightMargin;
                cpY.A0k = r8.topMargin;
                cpY.A09 = r8.bottomMargin;
                cpY.A06 = r8.A09;
                cpY.A04 = r8.A03;
                cpY.A0n = r8.A0q;
                cpY.A0U = r8.A0S;
                cpY.A0v = r8.A0v;
                cpY.A0u = r8.A0u;
                cpY.A0o = r8.A0W;
                cpY.A0R = r8.A0V;
                cpY.A0p = r8.A0Y;
                cpY.A0S = r8.A0X;
                cpY.A0q = r8.A0a;
                cpY.A0T = r8.A0Z;
                cpY.A07 = r8.A05;
                cpY.A02 = r8.A04;
                cpY.A0s = r8.A0s;
                cpY.A0O = r8.A0P;
                cpY.A0J = r8.A0K;
                cpY.A0L = r8.A0M;
                cpY.A0M = r8.A0N;
                cpY.A0N = r8.A0O;
                cpY.A0K = r8.A0L;
                cpY.A0G = r8.getMarginEnd();
                cpY.A0h = r8.getMarginStart();
                CS4 cs4 = cz8.A04;
                cs4.A03 = childAt.getVisibility();
                cs4.A00 = childAt.getAlpha();
                C25620Cj0 cj0 = cz8.A05;
                cj0.A01 = childAt.getRotation();
                cj0.A02 = childAt.getRotationX();
                cj0.A03 = childAt.getRotationY();
                cj0.A04 = childAt.getScaleX();
                cj0.A05 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    cj0.A06 = pivotX;
                    cj0.A07 = pivotY;
                }
                cj0.A08 = childAt.getTranslationX();
                cj0.A09 = childAt.getTranslationY();
                cj0.A0A = childAt.getTranslationZ();
                if (cj0.A0B) {
                    cj0.A00 = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    C25966CpY cpY2 = cz8.A02;
                    cpY2.A0x = barrier.A01.A02;
                    cpY2.A0z = barrier.getReferencedIds();
                    cpY2.A0Y = barrier.A00;
                    cpY2.A0Z = barrier.A01.A01;
                }
                i++;
            } else {
                throw AnonymousClass8BR.A0w("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public static int A00(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public static SparseIntArray A01(SparseIntArray sparseIntArray, int i, int i2) {
        sparseIntArray.append(i, i2);
        return A02;
    }

    public static String A04(int i) {
        switch (i) {
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            default:
                return "end";
        }
    }

    public void A07(int i) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new CZ8());
        }
        C25966CpY cpY = ((CZ8) hashMap.get(valueOf)).A02;
        cpY.A0W = 2131433415;
        cpY.A0X = -1;
        cpY.A0V = 0;
    }

    public void A0A(ConstraintLayout constraintLayout) {
        A0B(constraintLayout);
        constraintLayout.A0A = null;
        constraintLayout.requestLayout();
    }
}
