using System;
using Xunit;
using TDDPractice;

namespace TDDPracticeTests
{
    public class MyMathTest
    {
        [Fact]
        public void AddTwoIntegers_WhenPassTwoIntegers_ShouldReturnExpectedSumResult()
        {
            const int a = 10;
            const int b = 20;

            const int expectedResult = 30;

            var myMath = new MyMath();

            var result = myMath.AddTwoIntegers(a, b);

            Assert.Equal(expectedResult, result);
        }
    }
}
