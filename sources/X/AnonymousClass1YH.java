package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.1YH  reason: invalid class name */
public abstract class AnonymousClass1YH {
    public static final Object A00 = new Object();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static int A01(TypedArray typedArray) {
        return typedArray.getType(0);
    }

    public static Typeface A03(Context context, int i) {
        Context context2 = context;
        if (context.isRestricted()) {
            return null;
        }
        return A05(context2, new TypedValue(), (C28251Zq) null, i, 0, false, false);
    }

    public static Typeface A04(Context context, TypedValue typedValue, C28251Zq r9, int i, int i2) {
        Context context2 = context;
        if (context.isRestricted()) {
            return null;
        }
        return A05(context2, typedValue, r9, i, i2, true, false);
    }

    public static void A06(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            } else {
                continue;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    public static int A00(Resources.Theme theme, Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass1YJ.A00(theme, resources, i);
        }
        return resources.getColor(i);
    }

    public static ColorStateList A02(Resources.Theme theme, Resources resources, int i) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        C29041bW r5;
        Resources.Theme theme2;
        AnonymousClass1YI r4 = new AnonymousClass1YI(theme, resources);
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(r4);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (r5 = (C29041bW) sparseArray.get(i)) == null)) {
                if (!r5.A02.equals(r4.A01.getConfiguration()) || (!((theme2 = r4.A00) == null && r5.A00 == 0) && (theme2 == null || r5.A00 != theme2.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    colorStateList = r5.A01;
                }
            }
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        ColorStateList colorStateList2 = null;
        if (!z) {
            try {
                colorStateList2 = AnonymousClass1bU.A01(theme, resources, resources.getXml(i));
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList2 != null) {
            synchronized (obj) {
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(r4);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(r4, sparseArray2);
                }
                sparseArray2.append(i, new C29041bW(colorStateList2, r4.A01.getConfiguration(), theme));
            }
            return colorStateList2;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass1YJ.A01(theme, resources, i);
        } else {
            return resources.getColorStateList(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r0v32, types: [X.2Ws, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024f, code lost:
        if (r33 == null) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03b1, code lost:
        if (r11 != null) goto L_0x03b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0254 A[Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0257 A[Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0274 A[Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02e8 A[Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface A05(android.content.Context r31, android.util.TypedValue r32, X.C28251Zq r33, int r34, int r35, boolean r36, boolean r37) {
        /*
            r23 = 0
            android.content.res.Resources r2 = r31.getResources()
            r6 = 1
            r7 = r32
            r9 = r34
            r2.getValue(r9, r7, r6)
            java.lang.String r22 = "ResourcesCompat"
            java.lang.CharSequence r0 = r7.string
            if (r0 == 0) goto L_0x03e7
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r8.startsWith(r0)
            r4 = r33
            if (r0 == 0) goto L_0x03de
            int r0 = r7.assetCookie
            X.00z r21 = X.C29271bw.A00
            r3 = r35
            java.lang.String r1 = X.C29271bw.A00(r2, r8, r9, r0, r3)
            r0 = r21
            java.lang.Object r11 = r0.A04(r1)
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11
            if (r11 == 0) goto L_0x0063
            if (r33 == 0) goto L_0x003b
            r4.A02(r11)
        L_0x003b:
            r23 = r11
        L_0x003d:
            if (r23 != 0) goto L_0x03e6
            if (r33 != 0) goto L_0x03e6
            if (r37 != 0) goto L_0x03e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Font resource ID #0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r9)
            r1.append(r0)
            java.lang.String r0 = " could not be retrieved."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        L_0x0063:
            if (r37 != 0) goto L_0x003d
            java.lang.String r1 = r8.toLowerCase()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r0 = ".xml"
            boolean r0 = r1.endsWith(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 == 0) goto L_0x0398
            android.content.res.XmlResourceParser r14 = r2.getXml(r9)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x0075:
            int r0 = r14.next()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r5 = 2
            if (r0 == r5) goto L_0x0080
            if (r0 != r6) goto L_0x0075
            goto L_0x0366
        L_0x0080:
            r10 = 0
            java.lang.String r1 = "font-family"
            r14.require(r5, r10, r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r0 = r14.getName()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 == 0) goto L_0x0205
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            int[] r0 = X.AnonymousClass1bV.A01     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.content.res.TypedArray r13 = r2.obtainAttributes(r1, r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0 = 0
            java.lang.String r20 = r13.getString(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0 = 4
            java.lang.String r15 = r13.getString(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0 = 5
            java.lang.String r11 = r13.getString(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r1 = 0
            int r10 = r13.getResourceId(r6, r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            int r19 = r13.getInteger(r5, r6)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r12 = 3
            r0 = 500(0x1f4, float:7.0E-43)
            int r18 = r13.getInteger(r12, r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0 = 6
            java.lang.String r17 = r13.getString(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r13.recycle()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r13 = 3
            if (r20 == 0) goto L_0x015a
            if (r15 == 0) goto L_0x015a
            if (r11 == 0) goto L_0x015a
        L_0x00c8:
            int r0 = r14.next()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 == r12) goto L_0x00d2
            A06(r14)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x00c8
        L_0x00d2:
            if (r10 != 0) goto L_0x00d9
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x0140
        L_0x00d9:
            android.content.res.TypedArray r16 = r2.obtainTypedArray(r10)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            int r0 = r16.length()     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x00e8
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0154 }
            goto L_0x013d
        L_0x00e8:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0154 }
            r12.<init>()     // Catch:{ all -> 0x0154 }
            int r0 = A01(r16)     // Catch:{ all -> 0x0154 }
            if (r0 != r6) goto L_0x0121
            r13 = 0
        L_0x00f4:
            int r0 = r16.length()     // Catch:{ all -> 0x0154 }
            if (r13 >= r0) goto L_0x013d
            r0 = r16
            int r0 = r0.getResourceId(r13, r1)     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x011e
            java.lang.String[] r10 = r2.getStringArray(r0)     // Catch:{ all -> 0x0154 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0154 }
            r6.<init>()     // Catch:{ all -> 0x0154 }
            int r14 = r10.length     // Catch:{ all -> 0x0154 }
            r5 = 0
        L_0x010d:
            if (r5 >= r14) goto L_0x011b
            r0 = r10[r5]     // Catch:{ all -> 0x0154 }
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ all -> 0x0154 }
            r6.add(r0)     // Catch:{ all -> 0x0154 }
            int r5 = r5 + 1
            goto L_0x010d
        L_0x011b:
            r12.add(r6)     // Catch:{ all -> 0x0154 }
        L_0x011e:
            int r13 = r13 + 1
            goto L_0x00f4
        L_0x0121:
            java.lang.String[] r13 = r2.getStringArray(r10)     // Catch:{ all -> 0x0154 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0154 }
            r10.<init>()     // Catch:{ all -> 0x0154 }
            int r6 = r13.length     // Catch:{ all -> 0x0154 }
            r5 = 0
        L_0x012c:
            if (r5 >= r6) goto L_0x013a
            r0 = r13[r5]     // Catch:{ all -> 0x0154 }
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ all -> 0x0154 }
            r10.add(r0)     // Catch:{ all -> 0x0154 }
            int r5 = r5 + 1
            goto L_0x012c
        L_0x013a:
            r12.add(r10)     // Catch:{ all -> 0x0154 }
        L_0x013d:
            r16.recycle()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x0140:
            X.9mD r6 = new X.9mD     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0 = r20
            r6.<init>(r0, r15, r11, r12)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.2eU r10 = new X.2eU     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r5 = r17
            r1 = r19
            r0 = r18
            r10.<init>(r6, r5, r1, r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x020a
        L_0x0154:
            r0 = move-exception
            r16.recycle()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x036d
        L_0x015a:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r12.<init>()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x015f:
            int r0 = r14.next()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 == r13) goto L_0x01f0
            int r0 = r14.getEventType()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 != r5) goto L_0x015f
            java.lang.String r10 = r14.getName()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r0 = "font"
            boolean r0 = r10.equals(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 == 0) goto L_0x01eb
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            int[] r0 = X.AnonymousClass1bV.A02     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.content.res.TypedArray r0 = r2.obtainAttributes(r10, r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10 = 8
            boolean r10 = r0.hasValue(r10)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r11 = 1
            if (r10 == 0) goto L_0x018c
            r11 = 8
        L_0x018c:
            r10 = 400(0x190, float:5.6E-43)
            int r27 = r0.getInt(r11, r10)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10 = 6
            boolean r11 = r0.hasValue(r10)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10 = 2
            if (r11 == 0) goto L_0x019b
            r10 = 6
        L_0x019b:
            int r10 = r0.getInt(r10, r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r30 = 0
            if (r6 != r10) goto L_0x01a5
            r30 = 1
        L_0x01a5:
            r10 = 9
            boolean r11 = r0.hasValue(r10)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10 = 3
            if (r11 == 0) goto L_0x01b0
            r10 = 9
        L_0x01b0:
            r11 = 7
            boolean r15 = r0.hasValue(r11)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r11 = 4
            if (r15 == 0) goto L_0x01b9
            r11 = 7
        L_0x01b9:
            java.lang.String r26 = r0.getString(r11)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            int r28 = r0.getInt(r10, r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10 = 5
            boolean r11 = r0.hasValue(r10)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10 = 0
            if (r11 == 0) goto L_0x01ca
            r10 = 5
        L_0x01ca:
            int r29 = r0.getResourceId(r10, r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r25 = r0.getString(r10)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0.recycle()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x01d5:
            int r0 = r14.next()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 == r13) goto L_0x01df
            A06(r14)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x01d5
        L_0x01df:
            X.2fw r0 = new X.2fw     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r12.add(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x015f
        L_0x01eb:
            A06(r14)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x015f
        L_0x01f0:
            boolean r0 = r12.isEmpty()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 == 0) goto L_0x01f7
            goto L_0x0209
        L_0x01f7:
            X.2fw[] r0 = new X.C55532fw[r1]     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.Object[] r0 = r12.toArray(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.2fw[] r0 = (X.C55532fw[]) r0     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.2Wr r10 = new X.2Wr     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10.<init>(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x020a
        L_0x0205:
            A06(r14)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x020a
        L_0x0209:
            r10 = 0
        L_0x020a:
            if (r10 != 0) goto L_0x021b
            java.lang.String r1 = "Failed to find font-family tag"
            r0 = r22
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r33 == 0) goto L_0x003d
            r0 = -3
            r4.A00(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x003d
        L_0x021b:
            int r5 = r7.assetCookie     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            boolean r0 = r10 instanceof X.C54652eU     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 == 0) goto L_0x0377
            X.2eU r10 = (X.C54652eU) r10     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r1 = r10.A03     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r11 = 0
            if (r1 == 0) goto L_0x0242
            boolean r0 = r1.isEmpty()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 != 0) goto L_0x0242
            r6 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r6)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r6)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r1 == 0) goto L_0x0242
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 != 0) goto L_0x0242
            r11 = r1
        L_0x0242:
            if (r11 == 0) goto L_0x0248
            if (r33 == 0) goto L_0x003b
            goto L_0x03b3
        L_0x0248:
            if (r36 == 0) goto L_0x024f
            int r0 = r10.A00     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r0 != 0) goto L_0x0255
            goto L_0x0251
        L_0x024f:
            if (r33 != 0) goto L_0x0255
        L_0x0251:
            r12 = 1
        L_0x0252:
            if (r36 == 0) goto L_0x0257
            goto L_0x0259
        L_0x0255:
            r12 = 0
            goto L_0x0252
        L_0x0257:
            r7 = -1
            goto L_0x025b
        L_0x0259:
            int r7 = r10.A01     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x025b:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.os.Handler r11 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r11.<init>(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.2Ws r0 = new X.2Ws     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0.A00 = r4     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.9mD r1 = r10.A02     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.2iT r6 = new X.2iT     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r6.<init>(r11, r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r12 == 0) goto L_0x02e8
            java.util.concurrent.ExecutorService r0 = X.C197519wp.A03     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10.<init>()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r0 = r1.A00     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10.append(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r0 = "-"
            r10.append(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10.append(r3)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r12 = r10.toString()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.00z r0 = X.C197519wp.A00     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.Object r11 = r0.A04(r12)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r11 != 0) goto L_0x036e
            r0 = -1
            if (r7 != r0) goto L_0x02a6
            r0 = r31
            X.2pT r0 = X.C197519wp.A00(r0, r1, r12, r3)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r6.A00(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.graphics.Typeface r11 = r0.A01     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x0387
        L_0x02a6:
            r18 = 0
            X.3DF r10 = new X.3DF     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r13 = r10
            r14 = r31
            r15 = r1
            r16 = r12
            r17 = r3
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.util.concurrent.ExecutorService r0 = X.C197519wp.A03     // Catch:{ InterruptedException -> 0x02dd }
            java.util.concurrent.Future r10 = r0.submit(r10)     // Catch:{ InterruptedException -> 0x02dd }
            long r0 = (long) r7     // Catch:{ InterruptedException -> 0x02dd }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x02d6, InterruptedException -> 0x02cb, TimeoutException -> 0x02cd }
            java.lang.Object r0 = r10.get(r0, r7)     // Catch:{ ExecutionException -> 0x02d6, InterruptedException -> 0x02cb, TimeoutException -> 0x02cd }
            X.2pT r0 = (X.C61312pT) r0     // Catch:{ InterruptedException -> 0x02dd }
            r6.A00(r0)     // Catch:{ InterruptedException -> 0x02dd }
            android.graphics.Typeface r11 = r0.A01     // Catch:{ InterruptedException -> 0x02dd }
            goto L_0x0387
        L_0x02cb:
            r1 = move-exception
            goto L_0x02d5
        L_0x02cd:
            java.lang.String r0 = "timeout"
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x02dd }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x02dd }
        L_0x02d5:
            throw r1     // Catch:{ InterruptedException -> 0x02dd }
        L_0x02d6:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x02dd }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x02dd }
            throw r0     // Catch:{ InterruptedException -> 0x02dd }
        L_0x02dd:
            r1 = -3
            X.2pT r0 = new X.2pT     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0.<init>((int) r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r6.A00(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x0386
        L_0x02e8:
            java.util.concurrent.ExecutorService r0 = X.C197519wp.A03     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r0 = r1.A00     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r7.append(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r0 = "-"
            r7.append(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r7.append(r3)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.String r7 = r7.toString()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.00z r0 = X.C197519wp.A00     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.Object r11 = r0.A04(r7)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r11 != 0) goto L_0x036e
            r0 = 0
            X.AGT r11 = new X.AGT     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r11.<init>(r6, r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.lang.Object r10 = X.C197519wp.A02     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            monitor-enter(r10)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.00O r6 = X.C197519wp.A01     // Catch:{ all -> 0x0363 }
            java.lang.Object r0 = r6.get(r7)     // Catch:{ all -> 0x0363 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0363 }
            if (r0 == 0) goto L_0x0322
            r0.add(r11)     // Catch:{ all -> 0x0363 }
            monitor-exit(r10)     // Catch:{ all -> 0x0363 }
            goto L_0x0360
        L_0x0322:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0363 }
            r0.<init>()     // Catch:{ all -> 0x0363 }
            r0.add(r11)     // Catch:{ all -> 0x0363 }
            r6.put(r7, r0)     // Catch:{ all -> 0x0363 }
            monitor-exit(r10)     // Catch:{ all -> 0x0363 }
            r15 = 1
            X.3DF r0 = new X.3DF     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10 = r0
            r11 = r31
            r12 = r1
            r13 = r7
            r14 = r3
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            java.util.concurrent.ExecutorService r11 = X.C197519wp.A03     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.2vS r10 = new X.2vS     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r10.<init>(r7)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r1 != 0) goto L_0x035a
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            android.os.Handler r7 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r7.<init>(r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x0350:
            r6 = 2
            X.DTg r1 = new X.DTg     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r1.<init>(r7, r0, r10, r6)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r11.execute(r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x0360
        L_0x035a:
            android.os.Handler r7 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x0350
        L_0x0360:
            r11 = r23
            goto L_0x0387
        L_0x0363:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0363 }
            goto L_0x036d
        L_0x0366:
            java.lang.String r1 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x036d:
            throw r0     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x036e:
            X.2pT r0 = new X.2pT     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0.<init>((android.graphics.Typeface) r11)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r6.A00(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x0387
        L_0x0377:
            X.1bx r1 = X.C29271bw.A01     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.2Wr r10 = (X.C51022Wr) r10     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0 = r31
            android.graphics.Typeface r11 = r1.A02(r0, r2, r10, r3)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r33 == 0) goto L_0x0387
            if (r11 == 0) goto L_0x03b8
            goto L_0x038a
        L_0x0386:
            r11 = 0
        L_0x0387:
            if (r11 == 0) goto L_0x003b
            goto L_0x038d
        L_0x038a:
            r4.A02(r11)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x038d:
            java.lang.String r1 = X.C29271bw.A00(r2, r8, r9, r5, r3)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0 = r21
            r0.A08(r1, r11)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x003b
        L_0x0398:
            int r0 = r7.assetCookie     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            X.1bx r5 = X.C29271bw.A01     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r6 = r31
            r7 = r2
            r10 = r3
            android.graphics.Typeface r11 = r5.A03(r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            if (r11 == 0) goto L_0x03af
            java.lang.String r1 = X.C29271bw.A00(r2, r8, r9, r0, r3)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            r0 = r21
            r0.A08(r1, r11)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
        L_0x03af:
            if (r33 == 0) goto L_0x003b
            if (r11 == 0) goto L_0x03b8
        L_0x03b3:
            r4.A02(r11)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x003b
        L_0x03b8:
            r0 = -3
            r4.A00(r0)     // Catch:{ XmlPullParserException -> 0x03c7, IOException -> 0x03be }
            goto L_0x003b
        L_0x03be:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to read xml resource "
            goto L_0x03cf
        L_0x03c7:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to parse xml resource "
        L_0x03cf:
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0 = r22
            android.util.Log.e(r0, r1, r2)
        L_0x03de:
            if (r33 == 0) goto L_0x003d
            r0 = -3
            r4.A00(r0)
            goto L_0x003d
        L_0x03e6:
            return r23
        L_0x03e7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Resource \""
            r1.append(r0)
            java.lang.String r0 = r2.getResourceName(r9)
            r1.append(r0)
            java.lang.String r0 = "\" ("
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r9)
            r1.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YH.A05(android.content.Context, android.util.TypedValue, X.1Zq, int, int, boolean, boolean):android.graphics.Typeface");
    }
}
