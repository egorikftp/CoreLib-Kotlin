package com.egoriku.corelib_kt.dsl

/**
 * Copyright (C) 2018 egorikftp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class Quadruple<A1, A2, A3, A4>(private val a1: A1, private val a2: A2, private val a3: A3, private val a4: A4) {
    operator fun component1(): A1 = a1
    operator fun component2(): A2 = a2
    operator fun component3(): A3 = a3
    operator fun component4(): A4 = a4
}
