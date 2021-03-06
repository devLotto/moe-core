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


#include <iostream>

#include "gc/collector_type.h"

// This was automatically generated by /Volumes/Android/inde-dev//art/tools/generate-operator-out.py --- do not edit!
namespace art {
namespace gc {
std::ostream& operator<<(std::ostream& os, const CollectorType& rhs) {
  switch (rhs) {
    case kCollectorTypeNone: os << "CollectorTypeNone"; break;
    case kCollectorTypeMS: os << "CollectorTypeMS"; break;
    case kCollectorTypeCMS: os << "CollectorTypeCMS"; break;
    case kCollectorTypeSS: os << "CollectorTypeSS"; break;
    case kCollectorTypeGSS: os << "CollectorTypeGSS"; break;
    case kCollectorTypeMC: os << "CollectorTypeMC"; break;
    case kCollectorTypeHeapTrim: os << "CollectorTypeHeapTrim"; break;
    case kCollectorTypeCC: os << "CollectorTypeCC"; break;
    case kCollectorTypeInstrumentation: os << "CollectorTypeInstrumentation"; break;
    case kCollectorTypeHomogeneousSpaceCompact: os << "CollectorTypeHomogeneousSpaceCompact"; break;
    default: os << "CollectorType[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace gc
}  // namespace art

