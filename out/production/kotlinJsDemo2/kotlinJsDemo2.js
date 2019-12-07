if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'kotlinJsDemo2'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'kotlinJsDemo2'.");
}
var kotlinJsDemo2 = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main(args) {
    println('hello world');
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('kotlinJsDemo2', _);
  return _;
}(typeof kotlinJsDemo2 === 'undefined' ? {} : kotlinJsDemo2, kotlin);
