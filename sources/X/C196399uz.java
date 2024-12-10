package X;

/* renamed from: X.9uz  reason: invalid class name and case insensitive filesystem */
public abstract class C196399uz {
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r11, android.content.Intent r12, X.BA8 r13) {
        /*
            r6 = 0
            java.lang.ClassLoader r0 = r11.getClassLoader()     // Catch:{ Exception -> 0x00ce }
            r12.setExtrasClassLoader(r0)     // Catch:{ Exception -> 0x00ce }
            android.os.Bundle r2 = r12.getExtras()     // Catch:{ Exception -> 0x00ce }
            if (r2 != 0) goto L_0x0012
            android.os.Bundle r2 = X.C17880vN.A0D()     // Catch:{ Exception -> 0x00ce }
        L_0x0012:
            java.lang.ClassLoader r0 = r11.getClassLoader()     // Catch:{ Exception -> 0x00ce }
            r2.setClassLoader(r0)     // Catch:{ Exception -> 0x00ce }
            r4 = 0
            java.lang.String r0 = r11.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x0025 }
            X.9oY r0 = X.C180919Ol.A00(r11, r0, r4)     // Catch:{ NameNotFoundException | RuntimeException -> 0x0025 }
            java.lang.String r5 = r0.A02     // Catch:{ NameNotFoundException | RuntimeException -> 0x0025 }
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ce }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00ce }
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ Exception -> 0x00ce }
            java.lang.String r1 = "t"
            java.lang.String r0 = java.lang.Long.toString(r9)     // Catch:{ JSONException -> 0x005a }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r1 = "r"
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ JSONException -> 0x005a }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x005a }
            if (r5 == 0) goto L_0x004b
            java.lang.String r0 = "v"
            r3.put(r0, r5)     // Catch:{ JSONException -> 0x005a }
        L_0x004b:
            java.lang.String r1 = r3.toString()     // Catch:{  }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{  }
            java.lang.String r0 = X.AnonymousClass8BT.A0x(r0)     // Catch:{  }
            goto L_0x005b
        L_0x005a:
            r0 = r6
        L_0x005b:
            X.9cT r5 = new X.9cT     // Catch:{ Exception -> 0x00ce }
            r5.<init>()     // Catch:{ Exception -> 0x00ce }
            r5.A01 = r0     // Catch:{ Exception -> 0x00ce }
            java.lang.String r1 = "com.facebook.invalid_class.f4c3b00c"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x00ce }
            r0.<init>(r11, r1)     // Catch:{ Exception -> 0x00ce }
            r5.A00 = r0     // Catch:{ Exception -> 0x00ce }
            android.content.Intent r3 = X.C17880vN.A0A()     // Catch:{ Exception -> 0x00ce }
            android.content.ComponentName r0 = r5.A00     // Catch:{ Exception -> 0x00ce }
            r3.setComponent(r0)     // Catch:{ Exception -> 0x00ce }
            r3.setFlags(r4)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r0 = r5.A01     // Catch:{ Exception -> 0x00ce }
            r3.setAction(r0)     // Catch:{ Exception -> 0x00ce }
            r3.setDataAndType(r6, r6)     // Catch:{ Exception -> 0x00ce }
            r3.setSourceBounds(r6)     // Catch:{ Exception -> 0x00ce }
            r3.setSelector(r6)     // Catch:{ Exception -> 0x00ce }
            r3.setClipData(r6)     // Catch:{ Exception -> 0x00ce }
            java.util.Set r0 = r5.A02     // Catch:{ Exception -> 0x00ce }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x00ce }
        L_0x008e:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x00ce }
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ Exception -> 0x00ce }
            r3.addCategory(r0)     // Catch:{ Exception -> 0x00ce }
            goto L_0x008e
        L_0x009c:
            android.content.ComponentName r0 = r3.getComponent()     // Catch:{ Exception -> 0x00ce }
            if (r0 == 0) goto L_0x00c6
            android.content.ComponentName r0 = r3.getComponent()     // Catch:{ Exception -> 0x00ce }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x00ce }
            r3.setPackage(r0)     // Catch:{ Exception -> 0x00ce }
            r0 = 1140850688(0x44000000, float:512.0)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r11, r4, r3, r0)     // Catch:{ Exception -> 0x00ce }
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = "_ci_"
            r2.putParcelable(r0, r1)     // Catch:{ Exception -> 0x00ce }
            r12.putExtras(r2)     // Catch:{ Exception -> 0x00ce }
            return
        L_0x00be:
            java.lang.String r0 = "Failed to generate CallerInfo metadata."
            X.9LY r1 = new X.9LY     // Catch:{ Exception -> 0x00ce }
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00ce }
            goto L_0x00cd
        L_0x00c6:
            java.lang.String r0 = "Must generate PendingIntent based on an explicit intent."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ Exception -> 0x00ce }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00ce }
        L_0x00cd:
            throw r1     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            X.9LY r0 = new X.9LY     // Catch:{ 9LY -> 0x00d5 }
            r0.<init>((java.lang.Exception) r1)     // Catch:{ 9LY -> 0x00d5 }
            throw r0     // Catch:{ 9LY -> 0x00d5 }
        L_0x00d5:
            r2 = move-exception
            java.lang.String r1 = "CallerInfoHelper"
            java.lang.String r0 = "Error attaching caller info to Intent."
            r13.CFI(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196399uz.A01(android.content.Context, android.content.Intent, X.BA8):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[ExcHandler: SecurityException (unused java.lang.SecurityException), SYNTHETIC, Splitter:B:14:0x0035] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A5J A00(android.content.Context r17, android.content.Intent r18) {
        /*
            java.lang.String r4 = "r"
            java.lang.String r1 = "t"
            java.lang.String r6 = "v"
            java.lang.String r7 = "d"
            r12 = 0
            java.lang.String r2 = "_ci_"
            r3 = r18
            boolean r0 = r3.hasExtra(r2)
            if (r0 == 0) goto L_0x0024
            android.os.Parcelable r8 = r3.getParcelableExtra(r2)
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8
            if (r8 != 0) goto L_0x0025
            android.os.Bundle r0 = r3.getExtras()
            if (r0 == 0) goto L_0x0024
            r0.get(r2)
        L_0x0024:
            return r12
        L_0x0025:
            java.lang.String r5 = r8.getCreatorPackage()
            int r18 = r8.getCreatorUid()
            if (r5 == 0) goto L_0x0024
            r0 = r17
            X.AiQ r11 = X.C20084A6l.A02(r0, r5)     // Catch:{  }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            r0 = 24
            r9 = 0
            if (r2 < r0) goto L_0x0058
            java.lang.Class<android.app.PendingIntent> r3 = android.app.PendingIntent.class
            r10 = 1
            java.lang.Class[] r2 = new java.lang.Class[r10]     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r9] = r0     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.String r0 = "getTag"
            java.lang.reflect.Method r3 = r3.getMethod(r0, r2)     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.String r0 = ""
            r2[r9] = r0     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.Object r2 = r3.invoke(r8, r2)     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            goto L_0x007a
        L_0x0058:
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.Object[] r3 = r2.toArray(r0)     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.Class<android.app.PendingIntent> r2 = android.app.PendingIntent.class
            java.lang.String r0 = "getIntent"
            java.lang.reflect.Method r2 = r2.getMethod(r0, r3)     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            java.lang.Object r0 = r2.invoke(r8, r0)     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
            if (r0 == 0) goto L_0x0024
            java.lang.String r2 = r0.getAction()     // Catch:{ SecurityException -> 0x0024, SecurityException -> 0x0024 }
        L_0x007a:
            r14 = 0
            r15 = 0
            if (r2 == 0) goto L_0x0024
            r0 = 11
            byte[] r0 = android.util.Base64.decode(r2, r0)     // Catch:{  }
            org.json.JSONObject r3 = X.AnonymousClass8BW.A0x(r0)     // Catch:{  }
            boolean r0 = r3.has(r7)     // Catch:{  }
            if (r0 == 0) goto L_0x0092
            java.lang.String r15 = r3.getString(r7)     // Catch:{  }
        L_0x0092:
            boolean r0 = r3.has(r6)     // Catch:{  }
            if (r0 == 0) goto L_0x009c
            java.lang.String r14 = r3.getString(r6)     // Catch:{  }
        L_0x009c:
            boolean r0 = r3.has(r1)     // Catch:{  }
            r6 = -1
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = r3.getString(r1)     // Catch:{  }
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{  }
        L_0x00ac:
            boolean r0 = r3.has(r4)     // Catch:{  }
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = r3.getString(r4)     // Catch:{  }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{  }
        L_0x00ba:
            long r1 = X.AnonymousClass8BR.A04(r1)     // Catch:{  }
            goto L_0x00c2
        L_0x00bf:
            r1 = -1
            goto L_0x00ac
        L_0x00c2:
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00d2
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{  }
            long r1 = r1 - r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
        L_0x00d2:
            java.util.List r16 = java.util.Collections.singletonList(r5)     // Catch:{  }
            java.util.List r17 = java.util.Collections.singletonList(r11)     // Catch:{  }
            X.A5J r13 = new X.A5J     // Catch:{  }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{  }
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196399uz.A00(android.content.Context, android.content.Intent):X.A5J");
    }
}
