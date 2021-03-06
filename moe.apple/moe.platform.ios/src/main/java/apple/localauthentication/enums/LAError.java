/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.localauthentication.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class LAError {
    @Generated @NInt public static final long AuthenticationFailed = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long UserCancel = 0xFFFFFFFFFFFFFFFEL;
    @Generated @NInt public static final long UserFallback = 0xFFFFFFFFFFFFFFFDL;
    @Generated @NInt public static final long SystemCancel = 0xFFFFFFFFFFFFFFFCL;
    @Generated @NInt public static final long PasscodeNotSet = 0xFFFFFFFFFFFFFFFBL;
    @Generated @NInt public static final long TouchIDNotAvailable = 0xFFFFFFFFFFFFFFFAL;
    @Generated @NInt public static final long TouchIDNotEnrolled = 0xFFFFFFFFFFFFFFF9L;
    @Generated @NInt public static final long TouchIDLockout = 0xFFFFFFFFFFFFFFF8L;
    @Generated @NInt public static final long AppCancel = 0xFFFFFFFFFFFFFFF7L;
    @Generated @NInt public static final long InvalidContext = 0xFFFFFFFFFFFFFFF6L;

    @Generated
    private LAError() {
    }

    @Generated @NInt public static final long BiometryNotAvailable = 0xFFFFFFFFFFFFFFFAL;
    @Generated @NInt public static final long BiometryNotEnrolled = 0xFFFFFFFFFFFFFFF9L;
    @Generated @NInt public static final long BiometryLockout = 0xFFFFFFFFFFFFFFF8L;
    @Generated @NInt public static final long NotInteractive = 0xFFFFFFFFFFFFFC14L;
}
