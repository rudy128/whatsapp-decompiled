package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.util.WeakHashMap;

/* renamed from: X.0Bl  reason: invalid class name */
public class AnonymousClass0Bl extends AnonymousClass3SV implements View.OnClickListener {
    public int A00 = -1;
    public int A01 = -1;
    public ColorStateList A02;
    public int A03 = -1;
    public int A04 = 1;
    public int A05 = -1;
    public int A06 = -1;
    public int A07 = -1;
    public final SearchableInfo A08;
    public final Context A09;
    public final WeakHashMap A0A;
    public final int A0B;
    public final SearchView A0C;

    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x012b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable A00(java.lang.String r12) {
        /*
            r11 = this;
            r8 = 0
            if (r12 == 0) goto L_0x01a5
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x01a5
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x01a5
            int r5 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            java.lang.String r0 = "android.resource://"
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            android.content.Context r4 = r11.A09     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            java.lang.String r0 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            java.lang.String r0 = "/"
            java.lang.String r3 = X.AnonymousClass001.A1I(r0, r1, r5)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            java.util.WeakHashMap r2 = r11.A0A     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            if (r0 != 0) goto L_0x0038
            goto L_0x003d
        L_0x0038:
            android.graphics.drawable.Drawable r1 = r0.newDrawable()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            if (r1 != 0) goto L_0x004d
            android.graphics.drawable.Drawable r1 = X.C19740yt.A04(r4, r5)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            if (r1 == 0) goto L_0x004d
            android.graphics.drawable.Drawable$ConstantState r0 = r1.getConstantState()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
            r2.put(r3, r0)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x004e }
        L_0x004d:
            return r1
        L_0x004e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Icon resource not found: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r12, r1)
            java.lang.String r0 = "SuggestionsAdapter"
            android.util.Log.w(r0, r1)
            return r8
        L_0x005e:
            java.util.WeakHashMap r4 = r11.A0A
            java.lang.Object r0 = r4.get(r12)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 == 0) goto L_0x006c
            android.graphics.drawable.Drawable r8 = r0.newDrawable()
        L_0x006c:
            if (r8 != 0) goto L_0x01a5
            android.net.Uri r6 = android.net.Uri.parse(r12)
            java.lang.String r7 = "Error closing icon stream for "
            java.lang.String r5 = "SuggestionsAdapter"
            r3 = 0
            java.lang.String r1 = r6.getScheme()     // Catch:{ FileNotFoundException -> 0x017e }
            java.lang.String r0 = "android.resource"
            boolean r0 = r0.equals(r1)     // Catch:{ FileNotFoundException -> 0x017e }
            if (r0 == 0) goto L_0x013b
            java.lang.String r10 = r6.getAuthority()     // Catch:{ NotFoundException -> 0x012b }
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ NotFoundException -> 0x012b }
            if (r0 != 0) goto L_0x010b
            android.content.Context r0 = r11.A09     // Catch:{ NameNotFoundException -> 0x00fb }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00fb }
            android.content.res.Resources r9 = r0.getResourcesForApplication(r10)     // Catch:{ NameNotFoundException -> 0x00fb }
            java.util.List r8 = r6.getPathSegments()     // Catch:{ NotFoundException -> 0x012b }
            if (r8 == 0) goto L_0x00eb
            int r7 = r8.size()     // Catch:{ NotFoundException -> 0x012b }
            r2 = 0
            r1 = 1
            if (r7 != r1) goto L_0x00b0
            java.lang.Object r0 = r8.get(r2)     // Catch:{ NumberFormatException -> 0x011b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x011b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x011b }
            goto L_0x00c3
        L_0x00b0:
            r0 = 2
            if (r7 != r0) goto L_0x00db
            java.lang.Object r1 = r8.get(r1)     // Catch:{ NotFoundException -> 0x012b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NotFoundException -> 0x012b }
            java.lang.Object r0 = r8.get(r2)     // Catch:{ NotFoundException -> 0x012b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NotFoundException -> 0x012b }
            int r0 = r9.getIdentifier(r1, r0, r10)     // Catch:{ NotFoundException -> 0x012b }
        L_0x00c3:
            if (r0 == 0) goto L_0x00cb
            android.graphics.drawable.Drawable r8 = r9.getDrawable(r0)     // Catch:{ NotFoundException -> 0x012b }
            goto L_0x019c
        L_0x00cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NotFoundException -> 0x012b }
            java.lang.String r0 = "No resource found for: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ NotFoundException -> 0x012b }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x012b }
            r1.<init>(r0)     // Catch:{ NotFoundException -> 0x012b }
            goto L_0x012a
        L_0x00db:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NotFoundException -> 0x012b }
            java.lang.String r0 = "More than two path segments: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ NotFoundException -> 0x012b }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x012b }
            r1.<init>(r0)     // Catch:{ NotFoundException -> 0x012b }
            goto L_0x012a
        L_0x00eb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NotFoundException -> 0x012b }
            java.lang.String r0 = "No path: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ NotFoundException -> 0x012b }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x012b }
            r1.<init>(r0)     // Catch:{ NotFoundException -> 0x012b }
            goto L_0x012a
        L_0x00fb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NotFoundException -> 0x012b }
            java.lang.String r0 = "No package found for authority: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ NotFoundException -> 0x012b }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x012b }
            r1.<init>(r0)     // Catch:{ NotFoundException -> 0x012b }
            goto L_0x012a
        L_0x010b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NotFoundException -> 0x012b }
            java.lang.String r0 = "No authority: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ NotFoundException -> 0x012b }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x012b }
            r1.<init>(r0)     // Catch:{ NotFoundException -> 0x012b }
            goto L_0x012a
        L_0x011b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NotFoundException -> 0x012b }
            java.lang.String r0 = "Single path segment is not a resource ID: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ NotFoundException -> 0x012b }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x012b }
            r1.<init>(r0)     // Catch:{ NotFoundException -> 0x012b }
        L_0x012a:
            throw r1     // Catch:{ NotFoundException -> 0x012b }
        L_0x012b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x017e }
            java.lang.String r0 = "Resource does not exist: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ FileNotFoundException -> 0x017e }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x017e }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x017e }
            goto L_0x017d
        L_0x013b:
            android.content.Context r0 = r11.A09     // Catch:{ FileNotFoundException -> 0x017e }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x017e }
            java.io.InputStream r0 = r0.openInputStream(r6)     // Catch:{ FileNotFoundException -> 0x017e }
            if (r0 == 0) goto L_0x016e
            android.graphics.drawable.Drawable r8 = android.graphics.drawable.Drawable.createFromStream(r0, r3)     // Catch:{ all -> 0x015c }
            r0.close()     // Catch:{ IOException -> 0x014f }
            goto L_0x019c
        L_0x014f:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x017e }
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r7, r0)     // Catch:{ FileNotFoundException -> 0x017e }
            android.util.Log.e(r5, r0, r1)     // Catch:{ FileNotFoundException -> 0x017e }
            goto L_0x019c
        L_0x015c:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x0161 }
            goto L_0x016d
        L_0x0161:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x017e }
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r7, r0)     // Catch:{ FileNotFoundException -> 0x017e }
            android.util.Log.e(r5, r0, r1)     // Catch:{ FileNotFoundException -> 0x017e }
        L_0x016d:
            throw r2     // Catch:{ FileNotFoundException -> 0x017e }
        L_0x016e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x017e }
            java.lang.String r0 = "Failed to open "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ FileNotFoundException -> 0x017e }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x017e }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x017e }
        L_0x017d:
            throw r1     // Catch:{ FileNotFoundException -> 0x017e }
        L_0x017e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Icon not found: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Log.w(r5, r0)
            r8 = r3
        L_0x019c:
            if (r8 == 0) goto L_0x01a5
            android.graphics.drawable.Drawable$ConstantState r0 = r8.getConstantState()
            r4.put(r12, r0)
        L_0x01a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Bl.A00(java.lang.String):android.graphics.drawable.Drawable");
    }

    public static String A01(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public CharSequence BFv(Cursor cursor) {
        String A012;
        if (cursor != null) {
            String A013 = A01(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (A013 == null) {
                SearchableInfo searchableInfo = this.A08;
                if (!searchableInfo.shouldRewriteQueryFromData() || (A013 = A01(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) {
                    if (!searchableInfo.shouldRewriteQueryFromText() || (A012 = A01(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                        return null;
                    }
                    return A012;
                }
            }
            return A013;
        }
        return null;
    }

    public boolean hasStableIds() {
        return false;
    }

    public AnonymousClass0Bl(SearchableInfo searchableInfo, Context context, SearchView searchView, WeakHashMap weakHashMap) {
        super(context, searchView.A0T);
        this.A0C = searchView;
        this.A08 = searchableInfo;
        this.A0B = searchView.A0S;
        this.A09 = context;
        this.A0A = weakHashMap;
    }

    public void BEZ(Cursor cursor) {
        try {
            super.BEZ(cursor);
            if (cursor != null) {
                this.A05 = cursor.getColumnIndex("suggest_text_1");
                this.A06 = cursor.getColumnIndex("suggest_text_2");
                this.A07 = cursor.getColumnIndex("suggest_text_2_url");
                this.A00 = cursor.getColumnIndex("suggest_icon_1");
                this.A01 = cursor.getColumnIndex("suggest_icon_2");
                this.A03 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public Cursor CGR(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        String suggestAuthority;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = this.A0C;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                SearchableInfo searchableInfo = this.A08;
                String[] strArr = null;
                if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
                    cursor = null;
                } else {
                    Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    String suggestSelection = searchableInfo.getSuggestSelection();
                    if (suggestSelection != null) {
                        strArr = new String[]{charSequence2};
                    } else {
                        fragment.appendPath(charSequence2);
                    }
                    fragment.appendQueryParameter("limit", String.valueOf(50));
                    cursor = this.A09.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr, (String) null);
                }
                if (cursor != null) {
                    cursor.getCount();
                    return cursor;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    public static String A02(Cursor cursor, String str) {
        return A01(cursor, cursor.getColumnIndex(str));
    }

    public View A05(Context context, Cursor cursor, ViewGroup viewGroup) {
        View A052 = super.A05(context, cursor, viewGroup);
        A052.setTag(new C03310Ho(A052));
        ((ImageView) A052.findViewById(2131430264)).setImageResource(this.A0B);
        return A052;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r13 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.database.Cursor r25, android.view.View r26) {
        /*
            r24 = this;
            java.lang.Object r9 = r26.getTag()
            X.0Ho r9 = (X.C03310Ho) r9
            r8 = r24
            int r1 = r8.A03
            r0 = -1
            r7 = 0
            r10 = r25
            if (r1 == r0) goto L_0x019c
            int r17 = r10.getInt(r1)
        L_0x0014:
            android.widget.TextView r6 = r9.A03
            if (r6 == 0) goto L_0x002d
            int r0 = r8.A05
            java.lang.String r0 = A01(r10, r0)
            r6.setText(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 == 0) goto L_0x002a
            r0 = 8
        L_0x002a:
            r6.setVisibility(r0)
        L_0x002d:
            android.widget.TextView r3 = r9.A04
            r5 = 2
            r4 = 1
            if (r3 == 0) goto L_0x009a
            int r0 = r8.A07
            java.lang.String r12 = A01(r10, r0)
            if (r12 == 0) goto L_0x0194
            android.content.res.ColorStateList r0 = r8.A02
            if (r0 != 0) goto L_0x005c
            android.util.TypedValue r11 = new android.util.TypedValue
            r11.<init>()
            android.content.Context r2 = r8.A09
            android.content.res.Resources$Theme r1 = r2.getTheme()
            r0 = 2130971542(0x7f040b96, float:1.7551825E38)
            r1.resolveAttribute(r0, r11, r4)
            android.content.res.Resources r1 = r2.getResources()
            int r0 = r11.resourceId
            android.content.res.ColorStateList r0 = r1.getColorStateList(r0)
            r8.A02 = r0
        L_0x005c:
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r12)
            android.content.res.ColorStateList r0 = r8.A02
            r19 = 0
            android.text.style.TextAppearanceSpan r2 = new android.text.style.TextAppearanceSpan
            r21 = r7
            r18 = r2
            r20 = r7
            r22 = r0
            r23 = r19
            r18.<init>(r19, r20, r21, r22, r23)
            int r1 = r12.length()
            r0 = 33
            r11.setSpan(r2, r7, r1, r0)
        L_0x007d:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x018a
            if (r6 == 0) goto L_0x008b
            r6.setSingleLine(r7)
            r6.setMaxLines(r5)
        L_0x008b:
            r3.setText(r11)
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            r0 = 0
            if (r1 == 0) goto L_0x0097
            r0 = 8
        L_0x0097:
            r3.setVisibility(r0)
        L_0x009a:
            android.widget.ImageView r12 = r9.A00
            if (r12 == 0) goto L_0x00ad
            int r1 = r8.A00
            r0 = -1
            if (r1 != r0) goto L_0x00f8
            r13 = 0
        L_0x00a4:
            r0 = 4
            r12.setImageDrawable(r13)
            if (r13 != 0) goto L_0x00ee
            r12.setVisibility(r0)
        L_0x00ad:
            android.widget.ImageView r3 = r9.A01
            r2 = 8
            if (r3 == 0) goto L_0x00c1
            int r1 = r8.A01
            r0 = -1
            if (r1 != r0) goto L_0x00e5
            r0 = 0
        L_0x00b9:
            r3.setImageDrawable(r0)
            if (r0 != 0) goto L_0x00db
            r3.setVisibility(r2)
        L_0x00c1:
            int r0 = r8.A04
            if (r0 == r5) goto L_0x00cb
            if (r0 != r4) goto L_0x01a0
            r0 = r17 & 1
            if (r0 == 0) goto L_0x01a0
        L_0x00cb:
            android.widget.ImageView r1 = r9.A02
            r1.setVisibility(r7)
            java.lang.CharSequence r0 = r6.getText()
            r1.setTag(r0)
            r1.setOnClickListener(r8)
            return
        L_0x00db:
            r3.setVisibility(r7)
            r0.setVisible(r7, r7)
            r0.setVisible(r4, r7)
            goto L_0x00c1
        L_0x00e5:
            java.lang.String r0 = r10.getString(r1)
            android.graphics.drawable.Drawable r0 = r8.A00(r0)
            goto L_0x00b9
        L_0x00ee:
            r12.setVisibility(r7)
            r13.setVisible(r7, r7)
            r13.setVisible(r4, r7)
            goto L_0x00ad
        L_0x00f8:
            java.lang.String r0 = r10.getString(r1)
            android.graphics.drawable.Drawable r13 = r8.A00(r0)
            if (r13 != 0) goto L_0x00a4
            android.app.SearchableInfo r0 = r8.A08
            android.content.ComponentName r16 = r0.getSearchActivity()
            java.lang.String r11 = r16.flattenToShortString()
            java.util.WeakHashMap r3 = r8.A0A
            boolean r0 = r3.containsKey(r11)
            r2 = 0
            if (r0 == 0) goto L_0x012b
            java.lang.Object r1 = r3.get(r11)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x017e
            android.content.Context r0 = r8.A09
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r13 = r1.newDrawable(r0)
        L_0x0127:
            if (r13 == 0) goto L_0x017e
            goto L_0x00a4
        L_0x012b:
            java.lang.String r1 = "SuggestionsAdapter"
            android.content.Context r0 = r8.A09
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            r14 = 128(0x80, float:1.794E-43)
            r0 = r16
            android.content.pm.ActivityInfo r0 = r13.getActivityInfo(r0, r14)     // Catch:{ NameNotFoundException -> 0x013c }
            goto L_0x0146
        L_0x013c:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            r13 = r2
            goto L_0x0175
        L_0x0146:
            int r14 = r0.getIconResource()
            if (r14 == 0) goto L_0x0174
            java.lang.String r15 = r16.getPackageName()
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            android.graphics.drawable.Drawable r13 = r13.getDrawable(r15, r14, r0)
            if (r13 != 0) goto L_0x0179
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid icon resource "
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = " for "
            r13.append(r0)
            java.lang.String r0 = r16.flattenToShortString()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r13)
            android.util.Log.w(r1, r0)
        L_0x0174:
            r13 = r2
        L_0x0175:
            r3.put(r11, r2)
            goto L_0x0127
        L_0x0179:
            android.graphics.drawable.Drawable$ConstantState r2 = r13.getConstantState()
            goto L_0x0175
        L_0x017e:
            android.content.Context r0 = r8.A09
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r13 = r0.getDefaultActivityIcon()
            goto L_0x00a4
        L_0x018a:
            if (r6 == 0) goto L_0x008b
            r6.setSingleLine(r4)
            r6.setMaxLines(r4)
            goto L_0x008b
        L_0x0194:
            int r0 = r8.A06
            java.lang.String r11 = A01(r10, r0)
            goto L_0x007d
        L_0x019c:
            r17 = 0
            goto L_0x0014
        L_0x01a0:
            android.widget.ImageView r0 = r9.A02
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Bl.A06(android.database.Cursor, android.view.View):void");
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A042 = A04(this.A09, BQ4(), viewGroup);
            if (A042 != null) {
                ((C03310Ho) A042.getTag()).A03.setText(e.toString());
            }
            return A042;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A052 = A05(this.A09, BQ4(), viewGroup);
            ((C03310Ho) A052.getTag()).A03.setText(e.toString());
            return A052;
        }
    }

    public void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor BQ4 = BQ4();
        if (BQ4 != null && (extras = BQ4.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor BQ4 = BQ4();
        if (BQ4 != null && (extras = BQ4.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A0C.A0L((CharSequence) tag);
        }
    }

    public void A07(int i) {
        this.A04 = i;
    }
}
